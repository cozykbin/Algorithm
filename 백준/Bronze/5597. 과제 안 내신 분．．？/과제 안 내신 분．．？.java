import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		boolean[] hw = new boolean[31];

		for (int i = 0; i < 28; i++) {
			int A = Integer.parseInt(in.readLine());
			hw[A] = true;
		}

		for (int i = 1; i < 31; i++) {
			if (hw[i] == false) {
				System.out.println(i);
			}
		}

	}
}