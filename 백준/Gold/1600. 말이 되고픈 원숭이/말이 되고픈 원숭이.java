import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class Monkey {
        int h, w, count, k;
        
        Monkey(int h, int w, int count, int k) {
            this.h = h;
            this.w = w;
            this.count = count;
            this.k = k;
        }
    }

    static int K, W, H;
    static int[][] map;
    static boolean[][][] visited;

    static int[] dh = {-1, 1, 0, 0};
    static int[] dw = {0, 0, -1, 1};

    static int[] horseH = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] horseW = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(in.readLine());

        StringTokenizer st = new StringTokenizer(in.readLine());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][W];
        visited = new boolean[H][W][K + 1]; // 0에서 K번까지 
        
        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < W; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<Monkey> q = new LinkedList<>();

        q.offer(new Monkey(0, 0, 0, 0));
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
        	Monkey curr = q.poll();

            if (curr.h == H - 1 && curr.w == W - 1) {
                return curr.count;
            }

            for (int d = 0; d < 4; d++) {
                int nh = curr.h + dh[d];
                int nw = curr.w + dw[d];

                if (nh >= 0 && nw >= 0 && nh < H && nw < W && map[nh][nw] == 0 && !visited[nh][nw][curr.k]) {
                    visited[nh][nw][curr.k] = true;
                    q.offer(new Monkey(nh, nw, curr.count + 1, curr.k));
                }
            }

            if (curr.k < K) {
                for (int d = 0; d < 8; d++) {
                    int nh = curr.h + horseH[d];
                    int nw = curr.w + horseW[d];

                    if (nh >= 0 && nw >= 0 && nh < H && nw < W && map[nh][nw] == 0 && !visited[nh][nw][curr.k + 1]) {
                        visited[nh][nw][curr.k + 1] = true;
                        q.offer(new Monkey(nh, nw, curr.count + 1, curr.k + 1));
                    }
                }
            }
        }

        return -1;
    }
}