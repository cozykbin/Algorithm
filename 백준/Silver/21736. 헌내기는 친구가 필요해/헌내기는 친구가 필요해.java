import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Doyeon {
	int x, y, m;

	Doyeon(int x, int y, int m) {
		this.x = x;
		this.y = y;
		this.m = m;
	}
}

public class Main {
	/*
	 * 2020년에 입학한 헌내기 도연이가 있다. 도연이는 비대면 수업 때문에 학교에 가지 못해 학교에 아는 친구가 없었다. 드디어 대면 수업을
	 * 하게 된 도연이는 어서 캠퍼스 내의 사람들과 친해지고 싶다. 도연이가 다니는 대학의 캠퍼스는 크기이며 캠퍼스에서 이동하는 방법은 벽이 아닌
	 * 상하좌우로 이동하는 것이다. 예를 들어, 도연이가 (
	 * 
	 * $y$)에 있다면 이동할 수 있는 곳은 ( $y-1$)이다. 단, 캠퍼스의 밖으로 이동할 수는 없다.
	 * 
	 * 불쌍한 도연이를 위하여 캠퍼스에서 도연이가 만날 수 있는 사람의 수를 출력하는 프로그램을 작성해보자.
	 * 
	 * 입력 첫째 줄에는 캠퍼스의 크기를 나타내는 두 정수 N M
	 * 
	 * 둘째 줄부터 $N$개의 줄에는 캠퍼스의 정보들이 주어진다. O는 빈 공간, X는 벽, I는 도연이, P는 사람이다. I가 한 번만 주어짐이
	 * 보장된다.
	 * 
	 * 출력 첫째 줄에 도연이가 만날 수 있는 사람의 수를 출력한다. 단, 아무도 만나지 못한 경우 TT를 출력한다.
	 */

	private static int N, M, answer;
	private static int[] x = { 0, 0, 1, -1 };
	private static int[] y = { 1, -1, 0, 0 };
	private static int[][] map;
	private static boolean[][] isVisited;
	static Doyeon doyeon = new Doyeon(0, 0, 0);

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(in.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		answer = 0;

		map = new int[M + 1][N + 1];
		isVisited = new boolean[M + 1][N + 1];

		int startX = 0;
		int startY = 0;

		for (int i = 0; i < M; i++) {
			String input = in.readLine();
			char[] dot = new char[N];
			for (int j = 0; j < N; j++) { // O:빈공간(0) / X:벽(2) / I:도연(1) / P 사람(3)
				dot[j] = input.charAt(j);
				// System.out.println(dot[j]);
				if (dot[j] == 'O') {
					map[i][j] = 0;
				} else if (dot[j] == 'I') { // 도연
					map[i][j] = 1;
					doyeon.x = i;
					doyeon.y = j;

					startX = doyeon.x;
					startY = doyeon.y;
					// System.out.println(startX + ", " + startY);
				} else if (dot[j] == 'X') {
					map[i][j] = 2;
				} else if (dot[j] == 'P') {
					map[i][j] = 3;
				}
			}
		}

		dfs(startX, startY);
		if (doyeon.m == 0) {
			System.out.println("TT");
		} else {
			answer = doyeon.m;
			System.out.println(answer);

		}

	}

	private static void dfs(int currX, int currY) {
		isVisited[currX][currY] = true;

		for (int i = 0; i < 4; i++) {
			int nextX = currX + x[i];
			int nextY = currY + y[i];

			if (nextX >= 0 && nextY >= 0 && nextX < M && nextY < N && !isVisited[nextX][nextY]) {
				if (map[nextX][nextY] == 0) {
					dfs(nextX, nextY);
				} else if (map[nextX][nextY] == 2) {
					continue;
				}
				if (map[nextX][nextY] == 3) {
					doyeon.m++;
					dfs(nextX, nextY);
				} else {
					continue;
				}
			} else {
				continue;
			}
		}
	}

}