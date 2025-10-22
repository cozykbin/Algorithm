import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		int C = Integer.parseInt(in.readLine());

		int ABC = A * B * C;
		String abc = ABC + "";
		int[] cnt = new int[10];
		for (int i = 0; i < abc.length(); i++) {
			int nya = Integer.parseInt(abc.substring(i, i + 1));
			cnt[nya]++;

		}

		for (int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}

	}

}