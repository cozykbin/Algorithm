import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

/*N×M크기의 배열로 표현되는 미로가 있다.

1	0	1	1	1	1
1	0	1	0	1	0
1	0	1	0	1	1
1	1	1	0	1	1
미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 
이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오. 
한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.

위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.

입력
첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.

출력
첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.*/

	private static int N;
	private static int M;
	private static String[] input;
	private static int[][] arr;
	private static boolean[][] isVisited;
	private static int answer;
	private static int[] dx = {-1, 1, 0, 0};
	private static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		isVisited = new boolean[N][M];
		arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String line = in.readLine();
			for(int j = 0; j< M; j++) {
				arr[i][j] = line.charAt(j)-'0';
			}
		}
		
		answer = 0;
		answer = bfs(0,0,1);
		System.out.println(answer);
		
		
	}

	private static int bfs(int startX, int startY,int level) {
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[]{startX, startY,level});
		isVisited[startX][startY] = true;
	
		while(!q.isEmpty()) { ///!!!!!!!!!!!!!!!!
			int[] curr = q.poll();
			int currX = curr[0];
			int currY = curr[1];
			int currLevel = curr[2];
			
			if(currX == N-1 && currY == M-1) {

				return currLevel;
				
				}
			
			for(int i = 0; i < 4; i++) {
				int nextX =  currX + dx[i];
				int nextY = currY + dy[i];
	
			
			if(nextX >=0 && nextY >=0 && nextX<N && nextY<M ) {
				
				if(arr[nextX][nextY]==1 &&!isVisited[nextX][nextY]) {
					q.offer(new int[]{nextX,nextY,currLevel + 1});
					isVisited[nextX][nextY] = true;
				}			
			}
			
			
		}
	}
		return level;
}
}

//for(int i = 0; i < N; i++) {
//for(int j = 0; j < M; j++) {
//	if(isVisited[i][j]==true) {
//		answer++;	
//	}
//}
//}