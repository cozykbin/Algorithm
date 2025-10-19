import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		String[] input = in.readLine().split("");
		int[] toNum = new int[N];

		for (int i = 0; i < N; i++) {
			toNum[i] = input[i].charAt(0) - '0' - 48;
		}
		long H = 0;
		int ch = 0;
		for (int i = 0; i < N; i++) {
			H += (toNum[i] * Math.pow(31, i));
		}
		long answer = H % 1234567891;
		System.out.println(answer);
	}

}