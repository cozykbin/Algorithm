import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int turn = 0;
		for(int i = 0; i < 10; i++) {
			int A = Integer.parseInt(in.readLine());
			turn += A;
		}
		
		if(turn%4 == 0) {
			System.out.println("N");
		} else if(turn%4 == 1) {
			System.out.println("E");
		} else if(turn%4 == 2) {
			System.out.println("S");
		} else if(turn%4 == 3) {
			System.out.println("W");
		}

}
}