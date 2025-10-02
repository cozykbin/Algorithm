import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, T, P;
	static int[] input;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());
		input = new int[6];
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		for(int i = 0; i < 6; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		StringTokenizer ST = new StringTokenizer(in.readLine());

		
		T = Integer.parseInt(ST.nextToken());
		P = Integer.parseInt(ST.nextToken());
		
		int CntT = 0 ;
		
		for(int i = 0; i < 6 ; i ++) {
			if(input[i]==0) {
				continue;
			}
			if((input[i]%T)==0) {
				CntT += (input[i]/T);
			}else {
				CntT += (input[i]/T)+1;
			}
		}

		
		System.out.println(CntT);
		int CntS = 0;
		int CntP = 0;
		if(N<P) {
			CntS = 0;
			CntP = N;
		}else {
		
		CntS = N/P;
		CntP = (N%P);
		
		
		}
		
		System.out.println(CntS + " " + CntP);

			

	}

}