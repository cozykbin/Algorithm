import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			sb.append("Data Set ").append(tc+":").append("\n");
			int num = Integer.parseInt(in.readLine());
			String Line = in.readLine();

			for (int i = 0; i < Line.length(); i++) {
				char curr = Line.charAt(i);

				if (curr == 'c') {
					num++;
				} else if (curr == 'b') {
					num--;
				}
			}
			sb.append(num).append("\n");
			if (tc != T) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}