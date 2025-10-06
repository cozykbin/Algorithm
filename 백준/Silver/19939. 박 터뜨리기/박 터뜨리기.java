import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int K, N;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		N = Integer.parseInt(st.nextToken()); // 공
		K = Integer.parseInt(st.nextToken()); // 바구니

		int cnt = 0;
		for (int i = 1; i <= K; i++) {
			cnt += i; // 바구니마다 한개씩 차이나도록 일단 담
		}

		if (cnt > N) { // 공이 부족하면 실패
			System.out.println(-1);
			return;
		}

		int answer = 0;

		int na = N - cnt;
		if (na%K == 0) { // 나머지가 존재할 때 가장 큰 바구니부터 하나씩 넣으므로, 한개 차이가 더 나게 됨
			answer = K - 1;

		} else {
			answer = K;
		}
		System.out.println(answer);
	}
}