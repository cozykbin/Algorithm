import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		int M = Integer.parseInt(in.readLine());

		boolean[][] map = new boolean[N + 1][N + 1];
		int cnt = 0;

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			map[n][m] = true;
			map[m][n] = true;

		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= N; k++) {
					if (map[j][i] && map[i][k]) {
						map[j][k] = true;
						map[k][j] = true;

					}

				}
			}
		}

		for (int j = 2; j <= N; j++) {
			if (map[j][1]||map[1][j]) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}
}
