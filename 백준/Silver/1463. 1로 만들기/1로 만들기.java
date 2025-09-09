import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken());

		int[] dp = new int[N + 1];

		dp[1] = 0;


		for (int i = 2; i <= N; i++) {

			if (i%2 == 0 && i%3 !=0) {
				dp[i] = Math.min(dp[i - 1], dp[i/2])+1;
			} else if (i%2 != 0 && i%3 ==0) {
				dp[i] = Math.min(dp[i - 1], dp[i/3])+1;
			} else if (i%6 ==0) {
				dp[i] = Math.min(dp[i - 1], Math.min(dp[i/2],dp[i/3]))+1;
			} else {
				dp[i] = dp[i - 1]+1;
			}
		}

		System.out.println(dp[N]);
	}
}