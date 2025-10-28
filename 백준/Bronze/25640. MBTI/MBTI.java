import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String target = in.readLine();
		int N = Integer.parseInt(in.readLine());

		int answer = 0;
		for (int i = 0; i < N; i++) {
			String friend = in.readLine();
			if (friend.equals(target)) {
				answer++;
			}

		}

		System.out.println(answer);

	}

}