import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();

		int len = input.length();
		char[] cut = new char[len];
		cut = input.toCharArray();
		for (int i = 0; i < len; i++) {
			// cut[i] -= '0'; 왜그랬
			if (cut[i] >= 65 && cut[i] <= 90) {
				cut[i] += 32;
			} else if (cut[i] >= 97 && cut[i] <= 122) {
				cut[i] -= 32;
			}
			System.out.print(cut[i]);
		}

	}
}