import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

//	private static class Node {
//		public int vertex; // 간선으로 연결된 상대 정점 
//		public Node link;	// 같은 출발 정점에서 연결된 다음 이웃 노드 가르키는 포인터..
//		
//		public Node (int vertex, Node link) {
//			this.vertex = vertex;
//			this.link = link;
//		}
////		@Override
////		public String toString() {
////			return "Node [vertex=" + vertex + ", link=" + link + "]";
////		}
//		
//	}

	private static int N; // 정점 개수
	private static int M; // 간선 개수
	private static int V;// 시작 정점 번호
	private static String[] input;

	private static ArrayList<Integer>[] A;

//	private static Node[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		input = new String[3];
		input = in.readLine().split(" ");

		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		V = Integer.parseInt(input[2]);

//			adjList = new Node[N+1]; //////보자

		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}

		int from, to;
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());

//				adjList[from] = new Node(to, adjList[from]);
//				adjList[to] = new Node(from, adjList[to]);

			A[from].add(to);
			A[to].add(from);

		}
//			System.out.println(N);
//			System.out.println(M);
//			System.out.println(V);
		for (int i = 1; i <= N; i++) {
			Collections.sort(A[i]);
		}

		dfs(V, new boolean[N + 1]);
		System.out.println();
		bfs(V);
	}

	private static void dfs(int current, boolean[] visited) {

		visited[current] = true;

		System.out.print(current + " ");

		for (int i : A[current]) {
			if (!visited[i]) {

				dfs(i, visited);
			}
		}
	}

	private static void bfs(int start) {
		Queue<Integer> queue = new ArrayDeque<>();
		boolean[] visited = new boolean[N + 1];

		queue.offer(start);
		visited[start] = true;

		int current = start;

		while (!queue.isEmpty()) {

			current = queue.poll();
			System.out.print(current + " ");

			for (int i : A[current]) {
				if (!visited[i]) { // 방문여부 체크 / temp.vertex : 다음 정점!

					// 다음 이동할 정점을 방문예약
					queue.offer(i);
					visited[i] = true; // 방문 처리
				}
			}
		}

	}

}