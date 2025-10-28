import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int total = 0;
		for (int i = 0; i < 4; i++) {
			total += Integer.parseInt(in.readLine());
		}

		if (total <= 1500) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}