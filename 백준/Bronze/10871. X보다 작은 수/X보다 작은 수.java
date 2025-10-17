import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		int[] menu = new int[N + 1];
		String[] input = in.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			menu[i] = Integer.parseInt(input[i]);
			if (menu[i] < X) {
				sb.append(menu[i] + " ");
			}

		}

		System.out.println(sb);

	}

}