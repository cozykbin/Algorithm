import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringBuilder sb = new StringBuilder();

		int M = Integer.parseInt(st.nextToken()); //

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> ifAll = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

		for (int i = 0; i < M; i++) {
			StringTokenizer input = new StringTokenizer(in.readLine());
			int cnt = input.countTokens();
			String move = input.nextToken();

			if (cnt == 2) {
				int num = Integer.parseInt(input.nextToken());

				if (move.equals("add")) {
					set.add(num);
				} else if (move.equals("remove")) {
					set.remove(num);
				} else if (move.equals("check")) {
					if (set.contains(num)) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
				} else if (move.equals("toggle")) {
					if (set.contains(num)) {
						set.remove(num);
					} else {
						set.add(num);
					}
				}
			}else {

			if (move.equals("all")) {
				set.clear();
					set.addAll(ifAll);
				
			} else if (move.equals("empty")) {
				set.clear();
			}
			}
		}
		System.out.println(sb);

	}
}