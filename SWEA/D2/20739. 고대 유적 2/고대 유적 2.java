import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	
	static int[][] map, cnts;
	static boolean way;
	static int lastX, lastY, max, cnt ;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			sb.append("#"+tc+" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			lastX = N-1;
			lastY = M-1;
			
			map = new int[N+1][M+1];

			for(int i = 0; i<N; i++) {
				StringTokenizer input = new StringTokenizer(in.readLine());
				for( int j = 0; j<M; j++) {
					map[i][j] = Integer.parseInt(input.nextToken());
				}
			}
			max = 0;
			for(int i = 0; i<N; i++) {
				cnt = 0;
				for( int j = 0; j<M+1; j++) {
					if(map[i][j] ==1) {
							cnt++;
							max = Math.max(max, cnt);
					}else {
						cnt = 0;
					}
				}
			}
			
			for(int i = 0; i<M; i++) {
				cnt = 0;
				for( int j = 0; j<N+1; j++) {
					if(map[j][i] ==1) {
							cnt++;
							max = Math.max(max, cnt);
					}else {
						cnt = 0;
					}
				}
			}
			if(max == 1) {
				max = 0;
			}
			sb.append(max).append("\n");
		}System.out.println(sb);
	}




}