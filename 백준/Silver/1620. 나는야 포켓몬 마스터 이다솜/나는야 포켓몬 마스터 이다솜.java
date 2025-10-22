import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		Map<Integer, String> map = new HashMap<>(); // ww
		Map<String, Integer> map2 = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String Pocketmon = in.readLine();
			map.put(i + 1, Pocketmon);
			map2.put(Pocketmon, i + 1);

		}

		for (int i = 0; i < T; i++) {
			String Q = in.readLine();

			if (!map2.containsKey(Q)) {
				int qKey = Integer.parseInt(Q);
				String answer = map.get(qKey);
				System.out.println(answer);
			} else if (map2.containsKey(Q)) {
				int answer = map2.get(Q);
				System.out.println(answer);

			}
		}
	//	System.out.println(sb);
	}
}