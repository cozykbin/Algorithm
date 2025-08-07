import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static int N, M, D;
	private static int[][] originalMap;
	private static int[] archers; // 궁수 열
	private static int maxKilled;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());

		originalMap = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 0; j < M; j++) {
				originalMap[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		archers = new int[3];
		maxKilled = 0;

		combination(0, 0);

		System.out.println(maxKilled);
	}

	private static void combination(int start, int count) {
		if (count == 3) {
			int killed = simulate(); // 시뮬레이션 시작
			maxKilled = Math.max(maxKilled, killed);
			return;
		}

		for (int i = start; i < M; i++) {
			archers[count] = i;
			combination(i + 1, count + 1);
		}
	}

	private static int simulate() {
		int[][] map = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = originalMap[i][j];
			}
		}

		int killedCount = 0;

		for (int turn = 0; turn < N; turn++) {
			List<int[]> targets = new ArrayList<>();

			// 1. 각 궁수가 공격할 적 찾기
			for (int archerCol : archers) {
				int minDist = Integer.MAX_VALUE;
				int targetR = -1, targetC = -1;

				for (int c = 0; c < M; c++) {
					for (int r = 0; r < N; r++) {
						if (map[r][c] == 1) {
							int dist = Math.abs(N - r) + Math.abs(archerCol - c);

							if (dist <= D) {
								if (dist < minDist) {
									minDist = dist;
									targetR = r;
									targetC = c;
								}
							}
						}
					}
				}

				if (targetR != -1) {
					targets.add(new int[] { targetR, targetC });
				}
			}

			// 2. 찾은 적들 제거하기
			for (int[] target : targets) {
				if (map[target[0]][target[1]] == 1) {
					map[target[0]][target[1]] = 0;
					killedCount++;
				}
			}

			// 3. 적들 아래로 한 칸 이동
			for (int i = N - 1; i > 0; i--) {
				for (int j = 0; j < M; j++) {
					map[i][j] = map[i - 1][j];
				}
			}
			for (int j = 0; j < M; j++) {
				map[0][j] = 0;
			}
		}

		return killedCount;
	}
}