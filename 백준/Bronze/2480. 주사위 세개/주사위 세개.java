import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int answer = 0;
		int big = Math.max(Math.max(A, B), C);

		if (A == B && B == C) {
			answer = 10000 + (A * 1000);
		} else if (A != B && B != C && A != C) {
			answer = big * 100;
		} 
		else if (A == B && B != C && A != C) {
			answer = 1000 + (A * 100);
		} else if (A != B && B == C && A != C) {
			answer = 1000 + (B * 100);
		} else if (A != B && B != C && A == C) {
			answer = 1000 + (A * 100);
		}

		System.out.println(answer);
	}

}