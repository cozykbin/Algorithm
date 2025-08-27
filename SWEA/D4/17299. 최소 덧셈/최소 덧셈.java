import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	private static int N;
	private static int times;
	private static int answer;
	private static double sumMin;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T;
		T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			String input = in.readLine();
			N = Integer.parseInt(input);
			times = (int)input.length();
			sumMin = Integer.MAX_VALUE;		


			for (int i = 0; i < times; i++) {
				double L = N / Math.pow(10,(times-i));
				double R = N % Math.pow(10,(times-i));
				
				
				sumMin = Math.min(sumMin,(L+R));
				
				}		
			answer = (int)sumMin;

			sb.append(answer).append("\n");
		}

		System.out.println(sb);
	}
}