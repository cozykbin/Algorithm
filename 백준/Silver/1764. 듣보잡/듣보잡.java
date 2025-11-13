import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringBuilder sb = new StringBuilder();

		int D = Integer.parseInt(st.nextToken()); //
		int B = Integer.parseInt(st.nextToken()); //

		Set<String> 듣도 = new HashSet<String>();
		Set<String> 듣보 = new HashSet<String>();

		for (int i = 0; i < D; i++) {
			String 과연 = in.readLine();
			듣도.add(과연);
		}

		for (int i = 0; i < B; i++) {
			String 과연 = in.readLine();

			if (듣도.contains(과연)) {
				듣보.add(과연);
			}
		}

		int cnt = 듣보.size();
		sb.append(cnt).append("\n");

		SortedSet<String> 듣보잡 = new TreeSet<>(듣보);

		for (int i = 0; i < cnt; i++) {
			sb.append(듣보잡.first()).append("\n");
			듣보잡.remove(듣보잡.first());
		}

		System.out.println(sb);
	}
}