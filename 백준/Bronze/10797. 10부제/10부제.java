import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		int[] nums = new int[5];
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			if (nums[i] == T) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}