import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int cnt = st.countTokens();
		int answer = 10001;

		for (int i = 0; i < cnt; i++) {
			int nextNum = Integer.parseInt(st.nextToken());
			answer = Math.min(answer, nextNum);

		}

		System.out.println(answer);
	}

}