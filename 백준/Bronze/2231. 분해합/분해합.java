import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String number = in.readLine();

		int N = Integer.parseInt(number);

		double B = 0;

		double sum = 0;
		while (sum != N) {
			sum = 0;
			if (B == N) {
				System.out.println(0);
				return;
			} else {
				B++;
			}
			String Bnum = (int) B + "";
			String[] Bnumbers = Bnum.split("");
			sum += B;
			for (int i = 0; i < Bnum.length(); i++) {
				sum += Double.parseDouble(Bnumbers[i]);
				// System.out.println("sum " + sum);
			}
		}
		int answer = (int) B;
		System.out.println(answer);
	}

}