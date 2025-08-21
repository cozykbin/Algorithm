import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	private static long N;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T;
		T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			N = Long.parseLong(in.readLine());
			long walk =0;
			long walkMin = Long.MAX_VALUE;
			long I = (long)Math.sqrt(N);
			
			
		
			for(long i = 1; i<=I; i++) {				
				if(i!=0 && N%i ==0) {
					walk = i + (N/i)-2;
					walkMin = Math.min(walk, walkMin);						
					}

			}

			sb.append(walkMin).append("\n");
		}

		System.out.println(sb);
	}
}