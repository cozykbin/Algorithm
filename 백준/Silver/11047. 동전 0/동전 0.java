import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] coins = new int[N];
		boolean find = false;
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			coins[i] = Integer.parseInt(in.readLine());
		}

		while (K != 0) {

			for (int i = N - 1; i >= 0; i--) {
//				System.out.println("i는 " + i + "K는" + K);
				if (!find) {
					if (coins[i] <= K) {
						int coinC = K / coins[i];
						int coinN = K % coins[i];
//						System.out.println(coins[i] * coinC + "냅니다.");
//						System.out.print(K + "에서 ");

						cnt += coinC;
						K = coinN;
//						System.out.println(K + "까쥐");
						find = true;
					}
				}
			}
			find = false;
		}

		System.out.println(cnt);
	}
}