import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		int answer = N / 5;

		if (N % 5 == 0) {

			System.out.println(answer);

		} else {
			System.out.println(answer + 1);

		}

	}
}