import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());

		int[] nums = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(in.readLine());

		}

		Arrays.sort(nums);

		int cutter = Math.round((float) (N * 0.15));

		float answer = 0;
		for (int i = cutter; i < N - cutter; i++) {
			answer += nums[i];
		}

		answer = Math.round(answer / (N - (cutter * 2)));

		System.out.println((int) answer);
	}

}