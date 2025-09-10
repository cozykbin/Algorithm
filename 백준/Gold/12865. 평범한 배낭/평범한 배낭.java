import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 준서가 여행에 필요하다고 생각하는 N개의 물건이 있다. 
 * 각 물건은 무게 W와 가치 V를 가지는데, 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다. 
 * 아직 행군을 해본 적이 없는 준서는 최대 K만큼의 무게만을 넣을 수 있는 배낭만 들고 다닐 수 있다. 
 * 
 * 준서가 최대한 즐거운 여행을 하기 위해 배낭에 넣을 수 있는 물건들의 가치의 최댓값을 알려주자.

입력
첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다. 
두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.

입력으로 주어지는 모든 수는 정수이다.
한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.
*/
public class Main {

	static int N, K, W, V;
	static int[][] items;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		N = Integer.parseInt(st.nextToken()); // 물건 개수
		K = Integer.parseInt(st.nextToken()); // 최대 무게

		items = new int[N][2]; //
		dp = new int[N + 1][K + 1]; //

		for (int i = 0; i < N; i++) {
			StringTokenizer line = new StringTokenizer(in.readLine());
			items[i][0] = Integer.parseInt(line.nextToken()); // 무게
			items[i][1] = Integer.parseInt(line.nextToken()); // 가치

			// System.out.println(items[i][0] + " + " + items[i][1]);
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				int iWeight = items[i - 1][0];
				int iValue = items[i - 1][1];

				if (iWeight <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - iWeight] + iValue);
				} else {
					dp[i][j] = dp[i - 1][j];
				}

				// System.out.print(dp[i][j]);

			}

		}

		System.out.println(dp[N][K]);

	}
}