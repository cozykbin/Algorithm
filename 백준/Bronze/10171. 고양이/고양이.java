import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		sb.append("\\    /\\").append("\n");
		sb.append(" )  ( ')").append("\n");
		sb.append("(  /  )").append("\n");
		sb.append(" \\(__)|").append("\n");

System.out.println(sb);

	}

}