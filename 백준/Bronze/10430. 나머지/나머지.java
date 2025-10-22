import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(in.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		sb.append((A + B) % C).append("\n");
		sb.append(((A % C) + (B % C)) % C).append("\n");
		sb.append((A * B) % C).append("\n");
		sb.append(((A % C) * (B % C)) % C);

		System.out.println(sb);
	}

}