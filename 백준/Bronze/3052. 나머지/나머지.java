import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[] cnt = new int[42];

		for (int i = 0; i < 10; i++) {
			int input = Integer.parseInt(in.readLine());
			int index = input % 42;

			cnt[index] = 1;
		}

		int answer = 0;
		for (int i = 0; i < 42; i++) {
			answer += cnt[i];
		}
		System.out.println(answer);

	}

}