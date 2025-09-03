import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int R, C;
    static char[][] map;
    static boolean[][] visited;
    static int answer = 0;

    static int[] dr = {-1, 0, 1};
    static int[] dc = {1, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            if (dfs(i, 0)) {// 코딩천재 김유빈 짱
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static boolean dfs(int r, int c) {
        visited[r][c] = true;

        if (c == C - 1) {
            return true;
        }

        for (int d = 0; d < 3; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr >= 0 && nr < R && nc < C) {
                if (map[nr][nc] == '.' && !visited[nr][nc]) {
                    if (dfs(nr, nc)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}