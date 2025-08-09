import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	
	public static class Sister{
		int x;
		int time;
		
		Sister(int x, int time){
			this.x = x;	
			this.time = time;
		}
	}
	private static String[] input;
	private static int N;
	private static int K;
	private static int[] arr;
	private static boolean[] visited;
	private static int result;
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		input = new String[2];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		
		arr = new int[100001];
		
	//	arr[N] = 1;
		arr[K] = 2;
				
		
		visited = new boolean[100001];
		
		
		
		System.out.println(bfs());
		
	}


	public static int bfs() {
		Queue<Sister> queue = new ArrayDeque<>();
		queue.offer(new Sister(N,0));
		visited[N]=true;
		
		while(!queue.isEmpty()) {
			Sister curr = queue.poll();
			
				if(arr[curr.x] == 2) {
					return curr.time;		
				}
				
			int L = curr.x + 1;
			int R = curr.x - 1;
			int dou = curr.x*2;
			
	    

			if(curr.x >= 0 && curr.x <= 100000 && visited[curr.x]) {	
				
				if(L >= 0 && L <= 100000 && !visited[L]) {
					visited[L] = true;
					queue.offer(new Sister(L, curr.time +1));
					
				}if(R >= 0 && R <= 100000 && !visited[R]) {
					visited[R] = true;					
					queue.offer(new Sister(R, curr.time +1));
					
				}if(dou>=0 && dou <= 100000 && !visited[dou]) {
					visited[dou] = true;
					queue.offer(( new Sister(dou, curr.time +1)));
					
				}
				
				
			}

		}


		
		return -1;	
	}
	
	
	


}