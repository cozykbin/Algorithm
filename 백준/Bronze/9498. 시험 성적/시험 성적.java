import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(in.readLine());
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80 && score<=89) {
			System.out.println("B");
		}else if(score>=70 && score<=79) {
			System.out.println("C");
		}else if(score>=60 && score<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	
	}
	
	

		
	}