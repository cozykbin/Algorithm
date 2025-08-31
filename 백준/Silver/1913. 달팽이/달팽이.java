import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int N; // 배열 길이
	private static int find; // 찾아야 하는
	private static int[][] arr; // 배열


	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());
		find = Integer.parseInt(in.readLine());

		arr = new int[N][N];

		int cur = N * N; // 1씩 작아지며 채울 달팽이 머리
		int curX = 0;
		int curY = 0;
		int cnt = 0;

      	int ansX = 0;
		int ansY = 0;

		while (cur > 1) {
			int Length = N - (2 * cnt) - 1;

			for (int i = 0; i < Length; i++) {// 아래로
				arr[curX][curY] = cur--;
				curX++;
			}
			// 오른쪽 아래 모서리 도착
			for (int i = 0; i < Length; i++) { // 오른쪽으로
				arr[curX][curY] = cur--;
				curY++;
			}
			// 왼쪽 아래 모서리 도착

			for (int i = 0; i < Length; i++) {// 위로
				arr[curX][curY] = cur--;
				curX--;
			}
			// 오른쪽 위 모서리 도착

			for (int i = 0; i < Length; i++) {// 왼쪽으로
				arr[curX][curY] = cur--;
				curY--;
			}
			cnt++;

			curX++;
			curY++;
		}

		// N이 홀수면 가운데 1
		if (N % 2 == 1) {
			arr[N / 2][N / 2] = 1;
		}


		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");

				if (arr[i][j] == find) {
					ansX = i + 1;
					ansY = j + 1;

				}

			}
			System.out.println();
		}
		System.out.println(ansX + " " + ansY);

	}

}