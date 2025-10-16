import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(in.readLine());
		int F = Integer.parseInt(in.readLine());

		if (S > F) {
			System.out.println("flight");
		} else {
			System.out.println("high speed rail");
		}

	}

}