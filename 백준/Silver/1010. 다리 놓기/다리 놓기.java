import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {

			StringTokenizer st = new StringTokenizer(in.readLine());

			int N = Integer.parseInt(st.nextToken()); 
			int M = Integer.parseInt(st.nextToken()); 
			
			int[][] dp = new int[M + 1][N + 1];

			for (int i = 1; i <= M; i++) {
				for (int j = 1; j <= N; j++) {
					if (j > i) {
						continue;
					}
					if (j == 1) {
						dp[i][j] = i;
					} else if (i == j) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
					}
				}
			}

			sb.append(dp[M][N]).append("\n");
		}
		System.out.println(sb);
	}
}