import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(in.readLine());
		String o = " ";
		String star = "*";

		for (int i = 0; i < N; i++) {
			sb.append(o.repeat(N - i - 1)).append(star.repeat(i + 1)).append("\n");
		}
		System.out.println(sb);
	}

}