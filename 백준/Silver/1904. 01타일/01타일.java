import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static long[] fibo;
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		
		fibo = new long[N+2];
		fibo[0] = 1;
		fibo[1] = 2;
		
		
		for(int i = 2; i<=N; i++) {
			fibo[i-2] = fibo[i-2]%15746;
			fibo[i-1] = fibo[i-1]%15746;
			fibo[i] = fibo[i-2]+fibo[i-1];


		}
		
		
		long answer = fibo[N-1];
		System.out.println(answer);

	}
}