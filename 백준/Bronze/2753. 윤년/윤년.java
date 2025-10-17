import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		int answer = 0;

		if (N % 4 == 0 && N%100 !=0) {
			answer = 1;
		}else if (N % 400 == 0) {
			answer = 1;
		}
		System.out.println(answer);

	}

}