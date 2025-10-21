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

		if (N == 1) { // 돌이 1개면 점프 없이 종료
			System.out.println(0);
			return;
		}

		sJump = new int[N - 1]; // sJump[i] = (i+1 -> i+2) 돌 점프
		bJump = new int[N - 1]; // bJump[i] = (i+1 -> i+3) 돌 점프

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			sJump[i] = Integer.parseInt(st.nextToken());
			bJump[i] = Integer.parseInt(st.nextToken());
		}

		K = Integer.parseInt(in.readLine()); // KJump (i -> i+3)

		dp = new int[N];
		dp[0] = 0; // 1번 돌
		dp[1] = sJump[0];

		if (N == 2) { // 돌이 2개면 sJump 1회 후 종료
			System.out.println(dp[1]);
			return;
		}

		// 1. DP without K점프
		for (int i = 2; i < N; i++) {
			dp[i] = Math.min(dp[i - 1] + sJump[i - 1], dp[i - 2] + bJump[i - 2]);
		}

		int minEnergy = dp[N - 1]; // 일단 최소 E가 이건데..

		// 2. DP with K점프
		for (int i = 3; i < N; i++) { // 더 줄일 수 있는 세계관을 향해
			int[] dpWithK = new int[N];

			dpWithK[0] = dp[0];
			dpWithK[1] = dp[1];
			dpWithK[2] = dp[2];

			// 4번돌 착지부터, K점프를 사용을 고려한 경우를 포함하여 계산하고 비교
			for (int j = 3; j < N; j++) {
				dpWithK[j] = Math.min(dpWithK[j - 1] + sJump[j - 1], dpWithK[j - 2] + bJump[j - 2]);

				if (j == i) {
					dpWithK[j] = Math.min(dpWithK[j], dp[j - 3] + K);
				}
			}

			minEnergy = Math.min(minEnergy, dpWithK[N - 1]);
		}
		System.out.println(minEnergy);
	}
}