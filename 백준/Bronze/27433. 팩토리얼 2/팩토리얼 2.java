import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		long answer = 1;

		if(n == 0) {
			System.out.println(answer);
			return;
		}else {
		for(int i = 1; i<=n; i++) {
			answer*=i;
		}
		
		System.out.println(answer);
	}
		
	}

}