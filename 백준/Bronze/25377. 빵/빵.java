import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		int bestT = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if( A <= B) {
				bestT = Math.min(bestT, B);
			}
		}
		
		if(bestT == Integer.MAX_VALUE) {
			bestT = -1;
		}
		System.out.println(bestT);

}
}