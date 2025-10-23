import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		String input;
		while ((input = in.readLine()) != null) {

			int A = Integer.parseInt(input);
			answer += A;
		}
		System.out.println(answer);
	}

}