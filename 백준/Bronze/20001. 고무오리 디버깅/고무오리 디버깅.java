import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		String input = in.readLine();
		while (true) {
			String line = in.readLine();
			// System.out.println("이번줄은!"+ line);

			if (line.equals("문제")) {
				cnt += 1;
				// System.out.println(cnt);

			} else if (line.equals("고무오리") && cnt > 0) {
				cnt -= 1;
				// System.out.println(cnt);

			} else if (line.equals("고무오리") && cnt <= 0) {
				cnt += 2;
				// System.out.println(cnt);

			} else if (line.equals("고무오리 디버깅 끝") && cnt <= 0) {
				System.out.println("고무오리야 사랑해");
				return;
			} else if (line.equals("고무오리 디버깅 끝") && cnt > 0) {
				System.out.println("힝구");
				return;
			}

		}
	}

}