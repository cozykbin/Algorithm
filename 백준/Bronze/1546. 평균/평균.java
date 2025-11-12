import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		double[] nums = new double[N];
		double best = 0;

		StringTokenizer st = new StringTokenizer(in.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			best = Math.max(best, nums[i]);
		}

		double sum = 0;
		for (int i = 0; i < N; i++) {
			nums[i] = nums[i] / best * 100;
			sum += nums[i];
		}

		double answer = sum / N;

		System.out.println(answer);

	}
}