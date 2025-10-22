import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input = in.readLine();
		int[] cnt = new int[28];
		for(int i = 0; i<28; i++) {
			cnt[i] = -1;
		}

		for (int i = 0; i < input.length(); i++) {
			int index = input.charAt(i)-96;
		//	System.out.println(index);
			if(cnt[index] == -1) {
				cnt[index] = i;
			}
		}

		for (int i = 1; i <= 26; i++) {
			System.out.print(cnt[i]+" ");
		}

	}

}