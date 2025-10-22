import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		for (int i = 1; i <= T; i++) {

			StringTokenizer st = new StringTokenizer(in.readLine());

			int R = Integer.parseInt(st.nextToken());
			String[] S = st.nextToken().split("");

			for (int j = 0; j < S.length; j++) {
				sb.append(S[j].repeat(R));
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}