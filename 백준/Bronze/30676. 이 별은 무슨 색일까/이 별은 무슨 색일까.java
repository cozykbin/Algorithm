import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(in.readLine());
		String answer;

		if (input >= 620 && input <= 780) {
			answer = "Red";
		} else if (input >= 590 && input < 620) {
			answer = "Orange";
		} else if (input >= 570 && input < 590) {
			answer = "Yellow";
		} else if (input >= 495 && input < 570) {
			answer = "Green";
		} else if (input >= 450 && input < 495) {
			answer = "Blue";
		} else if (input >= 425 && input < 450) {
			answer = "Indigo";
		} else {
			answer = "Violet";
		}

		System.out.println(answer);

	}
}