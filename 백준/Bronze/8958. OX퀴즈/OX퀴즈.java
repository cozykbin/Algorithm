import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			String[] input = in.readLine().split("");

			int score = 0;
			int cnt = 0;
			for (int i = 0; i < input.length; i++) {
				if (input[i].equals("O")) {
					cnt++;
					score += cnt;
				} else {
					cnt = 0;
					continue;
				}
			}

			sb.append(score).append("\n");

		}
		System.out.println(sb);

	}

}