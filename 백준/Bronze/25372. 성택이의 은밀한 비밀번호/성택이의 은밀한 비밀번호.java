import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int i = 0; i < T; i++) {
			String input = in.readLine();

			if (input.length() >= 6 && input.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}
	}
}