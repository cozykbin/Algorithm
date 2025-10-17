import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String AA = in.readLine();
		String BB = in.readLine();
		String CC = in.readLine();
		String AABB = AA + BB;

		int A = Integer.parseInt(AA);
		int B = Integer.parseInt(BB);
		int C = Integer.parseInt(CC);

		int AB = Integer.parseInt(AABB);

		System.out.println(A + B - C);
		System.out.println(AB - C);

	}

}