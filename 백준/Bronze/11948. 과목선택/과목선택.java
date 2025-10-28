import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int SciBest = 0;
		int SciMin = 10000;
		for (int i = 0; i < 4; i++) {
			int Sci = Integer.parseInt(in.readLine());
			SciBest += Sci;
			SciMin = Math.min(SciMin, Sci);
		}

		SciBest -= SciMin;

		int munBest = 0;
		int mun1 = Integer.parseInt(in.readLine());
		int mun2 = Integer.parseInt(in.readLine());

		munBest = Math.max(mun2, mun1);

		int answer = SciBest + munBest;

		System.out.println(answer);

	}

}