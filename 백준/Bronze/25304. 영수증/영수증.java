import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(in.readLine());
		int N = Integer.parseInt(in.readLine());
		
		int check = 0;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			check += a*b;
		}
		
		
		if(check == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

}
}