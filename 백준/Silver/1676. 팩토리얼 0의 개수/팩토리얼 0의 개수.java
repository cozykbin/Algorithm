import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		int cnt5 = 0;
		for (int i = 1; i <= N; i++) {
			int num = i;
			if (num % 5 == 0) {
				while (num % 5 == 0) {
					num /= 5;
					cnt5++;
				}
			}
		}
		System.out.println(cnt5);
	}
}