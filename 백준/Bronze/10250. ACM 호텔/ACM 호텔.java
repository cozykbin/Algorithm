import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine());

			int H = Integer.parseInt(st.nextToken());	//호텔 층
			int W = Integer.parseInt(st.nextToken());	//방 	수
			int N = Integer.parseInt(st.nextToken());	// 몇번째 손님인지

			int cheung = N % H;
			int ho = (N / H)+1;

			if(cheung == 0) {
				cheung = H;
				ho = (N/H);
			}
			

//			System.out.println("cheung: "+cheung);
//			System.out.println("ho: "+ho);
//			
			if(ho<10) {
				sb.append(cheung + "0"+ ho).append("\n");
			}else{
				sb.append(cheung +""+  ho).append("\n");

			}			
	}				System.out.println(sb);
}
}