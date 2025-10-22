import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());
		long[] nums = new long[22];

		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 1;
		nums[3] = 2;

		if (N > 3) {
			for (int i = 4; i <= N; i++) {
				nums[i] = nums[i - 1] + nums[i - 2];

			}
		}
		System.out.println(nums[N]);
	}
}