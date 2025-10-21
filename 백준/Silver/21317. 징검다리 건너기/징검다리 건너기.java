import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, K;
	static int[] sJump, bJump, dp;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());

	    if (N == 1) {
	         System.out.println(0);
	         return;
	      }
		
		sJump = new int[N - 1];
		bJump = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			sJump[i] = Integer.parseInt(st.nextToken());
			bJump[i] = Integer.parseInt(st.nextToken());
		}

		K = Integer.parseInt(in.readLine());

		dp = new int[N];
		dp[0] = 0;
		dp[1] = sJump[0];

		
		if (N == 2) {
		         System.out.println(sJump[0]);
	        return ;
	      }else if (N == 3) {
		         System.out.println(Math.min(sJump[0]+sJump[1],bJump[0]));
	        return ;
	      }
		
		// i, i+1 작은 점프 > 큰점 -> 큰점프 이득!
		for (int i = 2; i < N; i++) {
			dp[i] = Math.min(Math.min(dp[i - 1] + sJump[i - 1], dp[i - 2] + sJump[i - 2] + sJump[i - 1]),
					dp[i - 2] + bJump[i - 2]);
		}

		int minEnergy = Integer.MAX_VALUE;

		for (int i = 3; i < N; i++) {
			int[] dpHjump = new int[N + 1];
			dpHjump[0] = dp[0];
			dpHjump[1] = dp[1];
			dpHjump[2] = dp[2];
			// System.out.println("i: " + i);
			for (int j = 3; j < N; j++) {

				if (j == i) {
					dpHjump[j] = Math.min(dp[j - 3] + K,
							Math.min(
									Math.min(dpHjump[j - 1] + sJump[j - 1],
											dpHjump[j - 2] + sJump[j - 2] + sJump[j - 1]),
									dpHjump[j - 2] + bJump[j - 2]));
//					System.out.println("dp:" + dp[j - 3] + "K: " + K);

				} else {
					dpHjump[j] = Math.min(
							Math.min(dpHjump[j - 1] + sJump[j - 1], dpHjump[j - 2] + sJump[j - 2] + sJump[j - 1]),
							dpHjump[j - 2] + bJump[j - 2]);
				}

			}
//			System.out.println("dpHjump[N - 1]: " + dpHjump[N - 1]);
			minEnergy = Math.min(minEnergy, dpHjump[N - 1]);
//			System.out.println("minEnergy" + minEnergy);
//			System.out.println();

		}

		System.out.println(minEnergy);

	}
}