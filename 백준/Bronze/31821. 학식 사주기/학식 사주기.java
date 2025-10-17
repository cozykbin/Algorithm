import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		int[] menu = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			menu[i] = Integer.parseInt(in.readLine());
		}

		int S = Integer.parseInt(in.readLine());

		int answer = 0;

		for (int i = 0; i < S; i++) {
			answer += menu[Integer.parseInt(in.readLine())];
		}

		System.out.println(answer);

	}

}