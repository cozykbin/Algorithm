import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		int[] numbers = new int[N + 1];

		int Max = Integer.MIN_VALUE;

		int Min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(in.readLine());
		for (int i = 1; i <=N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
			if (numbers[i] > Max) {
				Max = numbers[i];
			}

			if (numbers[i] < Min) {
				Min = numbers[i];
			}

		}
		System.out.println(Min + " " + Max);
	}

}