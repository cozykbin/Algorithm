import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	private static int N; // 배열 길이
	private static int M; // 최대 치킨집 개수
	private static int Best; // 도시의 최소 치킨 거리

	private static int[][] map; // 지도
	private static ArrayList<Integer[]> House; // 집의 좌표 저장
	private static ArrayList<Integer[]> CK; // 치킨집의 좌표 저장
	
	// 각 집(ArrayList의 인덱스)에서 모든 치킨집까지의 거리를 미리 계산해서 저장하는 리스트
	private static ArrayList<ArrayList<Integer>> Len;
	
	// 조합으로 선택된 M개 치킨집의 인덱스를 저장할 배열
	private static int[] selected; 

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][N];
		House = new ArrayList<>();
		CK = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1) {
					House.add(new Integer[]{i, j});
				} else if (map[i][j] == 2) {
					CK.add(new Integer[]{i, j});
				}
			}
		}

		// 각 집에서 모든 치킨집까지의 거리를 미리 계산
		Len = new ArrayList<>();
		for (int i = 0; i < House.size(); i++) {
			ArrayList<Integer> dists = new ArrayList<>();
			int houseX = House.get(i)[0];
			int houseY = House.get(i)[1];

			for (int j = 0; j < CK.size(); j++) {
				int ckX = CK.get(j)[0];
				int ckY = CK.get(j)[1];
				int dist = Math.abs(houseX - ckX) + Math.abs(houseY - ckY);
				dists.add(dist);
			}
			Len.add(dists);
		}

		Best = Integer.MAX_VALUE;
		// 선택된 치킨집 인덱스를 저장할 배열 초기화
		selected = new int[M]; 
		comb(0, 0);
		System.out.println(Best);
	}

	/**
	 * M개의 치킨집을 선택하는 조합(Combination) 함수
	 * @param cnt 현재까지 선택한 치킨집의 개수
	 * @param start 조합을 시작할 인덱스 (중복 방지)
	 */
	public static void comb(int cnt, int start) {
		// M개의 치킨집을 모두 골랐다면
		if (cnt == M) { 
			// 현재 조합을 기준으로 도시의 치킨 거리를 계산하고, 최소값 갱신
			check(); 
			return;
		}

		// 전체 치킨집(CK) 중에서 M개를 뽑는다.
		for (int i = start; i < CK.size(); i++) {
			// i번째 치킨집을 선택했다고 'selected' 배열에 기록
			selected[cnt] = i; 
			comb(cnt + 1, i + 1);
		}
	}
	
	/**
	 * 'selected' 배열에 저장된 M개의 치킨집을 기준으로
	 * 도시의 치킨 거리를 계산하고 최소값을 갱신하는 함수
	 */
	private static void check() {
		int cityChickenDist = 0; // 현재 조합에서의 도시의 치킨 거리 총합
		
		// 1. 모든 집에 대하여 반복
		for (int i = 0; i < House.size(); i++) {
			int minDist = Integer.MAX_VALUE; // 현재 집에서 가장 가까운 치킨집까지의 거리
			
			// 2. 선택된 M개의 치킨집('selected' 배열)까지의 거리 중 최소값을 찾는다.
			for (int ck_idx : selected) {
				// Len.get(i) : i번째 집에서 모든 치킨집까지의 거리 리스트
				// .get(ck_idx) : 그 중에서 선택된 ck_idx번째 치킨집까지의 거리
				int dist = Len.get(i).get(ck_idx);
				minDist = Math.min(minDist, dist);
			}
			// 3. 찾은 최소 거리를 도시의 치킨 거리에 더한다.
			cityChickenDist += minDist;
		}
		
		// 4. 현재 조합의 도시 치킨 거리가 기존 최소값보다 작으면 갱신한다.
		Best = Math.min(Best, cityChickenDist);
	}
}