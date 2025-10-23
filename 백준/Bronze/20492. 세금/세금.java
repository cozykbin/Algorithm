import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		int a = N*78/100;
		int b = N*20/100;
		b = b*22/100;
		b=N-b;

		System.out.print(a+" ");
		System.out.println(b);

	}

}