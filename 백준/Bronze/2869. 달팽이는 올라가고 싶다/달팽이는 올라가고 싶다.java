import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int A, B, V;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());

		long day = V / (A - B);
		long left = A / (A - B);

		long answer = day - left + 1;
		long check = (answer - 1) * (A - B) + A;
		if (check >= V) {
			System.out.println(answer);

		} else {
			System.out.println(answer + 1);

		}
	}
}