import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String A = in.readLine();
		int index = Integer.parseInt(in.readLine());
		String B = A.substring(index - 1, index);

		System.out.println(B);

	}

}