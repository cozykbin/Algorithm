import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String[] input = in.readLine().split("");
		
		int answer = 0;
		
		for(int i = 0; i < N; i++) {
			answer += Integer.parseInt(input[i]);
		}
		
		System.out.println(answer);
	}

}