import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
    static int[] dp;
    static int[][] app;
    static int answer;
    
    static StringBuilder sb = new StringBuilder();
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken()); // 활성화 앱 개수
            M = Integer.parseInt(st.nextToken()); // 추가로 확보해야하는 메모리
 
            app = new int[N][2];
            int totalCost = 0;
            
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                app[j][0] = Integer.parseInt(st.nextToken()); //메모리
            }
            
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                app[j][1] = Integer.parseInt(st.nextToken()); //비용
                totalCost += app[j][1];

            }
       //     System.out.println(totalCost);

            
           int costSum = 0;
            
            dp = new int[totalCost + 1];
            dp[totalCost]= 0;
            
            for (int i = 0; i < N; i++) {
                int appMem = app[i][0];
                int appCost = app[i][1];
     
                costSum += appCost;
                
                for (int c = costSum; c >= appCost; c--) {
                    dp[c] = Math.max(dp[c], dp[c - appCost] + appMem);
                
         //       System.out.println(dp[c]);
            }
            }
            
            for (int c = 0; c <= totalCost; c++) {
                if (dp[c] >= M) {
                    System.out.println(c);                    
                    break;
                }
            }


            }
    }