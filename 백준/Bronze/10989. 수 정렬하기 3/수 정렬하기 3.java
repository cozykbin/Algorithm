import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());

		int[] nums = new int[10001];

		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(in.readLine());
			nums[a]++;
		}
		for (int i = 1; i < 10001; i++) {
			if (nums[i] > 1) {
				String idx = i+"\n";
				System.out.print(idx.repeat(nums[i]-1));
				System.out.println(i+"");
			}else if(nums[i] ==1) {
				String idx = i+ "";
				System.out.println(idx);
			}
		}
	}
}