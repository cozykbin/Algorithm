import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int one = Integer.parseInt(in.readLine());
		
		String[] inputTwo = in.readLine().split("");
		int A = Integer.parseInt(inputTwo[0]);
		int B = Integer.parseInt(inputTwo[1]);
		int C = Integer.parseInt(inputTwo[2]);

		sb.append(one * C).append("\n");
		sb.append(one * B).append("\n");
		sb.append(one * A).append("\n");
		sb.append(100*(one * A)+ 10*(one * B)+one * C);

		System.out.println(sb);
	}

}