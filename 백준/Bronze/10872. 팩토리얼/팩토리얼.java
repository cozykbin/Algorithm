import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		int answer = 1;
		if(N == 0) {
			System.out.println(answer);
			return;
		}
		for (int i = 1; i <= N; i++) {
			answer *=i;

				}
			
		System.out.println(answer);
	}
}