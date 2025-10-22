import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int C= Integer.parseInt(in.readLine());

		M += C;
		
		if(M >= 60) {
			int pH = M/60;
			int pM = M%60;	
			H+=pH;
			M=pM;
		}else if( M < 0) {
			H--;
			M+=60;
		}
		
		
		if(H >=24) {
			H-=24;
		}else if( H < 0) {
			H+=24;
		}


		System.out.println(H + " " + M);
	}

}