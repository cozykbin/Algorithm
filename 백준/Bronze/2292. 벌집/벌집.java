import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		if (N == 1) {
			System.out.println(1);
			return;
		}

		N -= 1;
		int cnt = 1;

		for (int i = 1; N > 0; i++) {
			cnt++;
			int A = 6 * i;
			N -= A;
		}

		System.out.println(cnt);
	}
}