import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken()); // 저장
		int M = Integer.parseInt(st.nextToken()); // 찾는

		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < N; i++) {
			StringTokenizer input = new StringTokenizer(in.readLine());
			map.put(input.nextToken(), input.nextToken());
		}

		for (int i = 0; i < M; i++) {
			String find = in.readLine();
			System.out.println(map.get(find));

		}
	}
}