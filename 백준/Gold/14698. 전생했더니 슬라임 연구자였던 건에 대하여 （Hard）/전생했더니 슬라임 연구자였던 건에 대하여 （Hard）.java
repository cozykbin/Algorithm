import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.LongUnaryOperator;

public class Main {

	private static long answer;
	private static ArrayList<Long> input;
	private static long Energy;
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(in.readLine());
		for(int tc = 1; tc<=T; tc++) {
			
		int N = Integer.parseInt(in.readLine());
		input = new ArrayList<Long>();
		answer = 1;
		Energy = 1;
			
		StringTokenizer st = new StringTokenizer(in.readLine());
			for(int i= 0; i< N; i++){
			input.add(Long.parseLong(st.nextToken()));
	}
			
			if(N==1) {
				answer = 1;	
			}else {
				while(input.size() != 2) {
					
				Collections.sort(input);

				Long frontSlime = input.get(0);
				Long backSlime = input.get(1);
							
				long newSlime = frontSlime*backSlime;
	
//				System.out.println("1번슬라임: " +frontSlime);		
//				System.out.println("2번슬라임: " +backSlime);		
//				System.out.println("합체슬라임: " + newSlime);		

				input.set(1, newSlime);		
				input.remove(0);
				
				long newEnergy =newSlime%1000000007;
//				System.out.println("곱해줄 에너지: "+ newEnergy);		

				Energy = (newEnergy*Energy)%1000000007;
//				System.out.println("총 에너지: "+ Energy);		
			}
				
				Long frontSlime = input.get(0);
				Long backSlime = input.get(1);
							
				long newEnergy = (frontSlime*backSlime)%1000000007;
				
				Energy = (newEnergy*Energy)%1000000007;
				answer = (answer*Energy)%1000000007;
				
			}
			
			sb.append(answer+"\n");		
			}
			System.out.println(sb);
		


	}
}

/*2
5
3 10 2 8 14
1
13
*/