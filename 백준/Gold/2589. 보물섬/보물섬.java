import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class monkey {
	int x;
	int y;
	int time;

	monkey(int x, int y, int time) {
		this.x = x;
		this.y = y;
		this.time = time;
	}
}

public class Main {
	static int N, M, answer;
	static char[][] map;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new char[N][M];

		for (int i = 0; i < N; i++) {
			String input = in.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = input.charAt(j);
			}
		}

		answer = 0; 

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'L') {
					answer = Math.max(answer, bfs(i, j));
				}
			}
		}
		System.out.println(answer);
	}

	private static int bfs(int startX, int startY) {
		boolean[][] isVisited = new boolean[N][M];
		int localMaxTime = 0;

		Queue<monkey> queue = new ArrayDeque<>();
		
		queue.offer(new monkey(startX, startY, 0));
		isVisited[startX][startY] = true;

		while (!queue.isEmpty()) {
			monkey currM = queue.poll();

			localMaxTime = Math.max(localMaxTime, currM.time);

			for (int i = 0; i < 4; i++) {
				int nextX = currM.x + dx[i];
				int nextY = currM.y + dy[i];
				int nextT = currM.time + 1; 

				if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M 
						&& !isVisited[nextX][nextY]
						&& map[nextX][nextY] == 'L') {
					
					isVisited[nextX][nextY] = true;
					
					queue.offer(new monkey(nextX, nextY, nextT));
				}
			}
		}
		
		return localMaxTime;
	}
}