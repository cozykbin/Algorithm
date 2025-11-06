import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {

			int K = Integer.parseInt(in.readLine()); // 층
			int N = Integer.parseInt(in.readLine()); // 호

			int[][] map = new int[K + 1][N];

			for (int i = 0; i < N; i++) {
				map[0][i] = i + 1;
			}

			for (int i = 0; i <= K; i++) {
				map[i][0] = 1;
			}

			for (int i = 1; i <= K; i++) {
				for (int j = 1; j < N; j++) {
					map[i][j] = map[i][j - 1] + map[i - 1][j];
				}
			}

			sb.append(map[K][N - 1]).append("\n");

		}
		System.out.println(sb);
	}
}