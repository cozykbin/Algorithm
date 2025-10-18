import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static boolean[] isVisited;
	static ArrayList<ArrayList<Integer>> input;
	static int[] p;
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());

		input = new ArrayList<>();
		isVisited = new boolean[N + 1];

		for (int i = 0; i <= N; i++) {
			input.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());

			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			input.get(start).add(end);
			input.get(end).add(start);

		}

		p = new int[N + 1];

		int start = 1;
		dfs(start);

		for (int i = 2; i <= N; i++) {
			System.out.println(p[i]);
		}

	}

	private static void dfs(int start) {
		isVisited[start] = true;

		for (int nextStart : input.get(start)) {
			if (!isVisited[nextStart]) {
				p[nextStart] = start;
				dfs(nextStart);
			}

		}

	}

}