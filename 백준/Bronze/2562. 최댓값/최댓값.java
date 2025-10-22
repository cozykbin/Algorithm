import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[] numbers = new int[10];
		int Best = 0;
		int BestIndex = 0;

		
		for(int i = 1; i<10; i++) {
			numbers[i] = Integer.parseInt(in.readLine());
			if(numbers[i]>Best) {
				Best = numbers[i];
				BestIndex = i;
			}
			
		}
		System.out.println(Best);
		System.out.println(BestIndex);
	}

}