import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(in.readLine()); //

		for (int t = 1; t <= T; t++) {
			int num = Integer.parseInt(in.readLine());

			if (num == 0) {
				sb.append("1 0").append("\n");
				continue;
			} else if (num == 1) {
				sb.append("0 1").append("\n");
				continue;

			}

			int[][] dp = new int[num + 1][2];

			dp[0][0] = 1;
			dp[1][1] = 1;

			for (int i = 2; i <= num; i++) {
				dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
				dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
			}

			sb.append(dp[num][0] + " " + dp[num][1]).append("\n");
		}

		System.out.println(sb);

	}
}