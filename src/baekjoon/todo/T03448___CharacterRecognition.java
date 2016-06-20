package baekjoon.todo;
import java.util.Scanner;

public class T03448___CharacterRecognition {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 0; t < testcase; t++) {

			double result = operate();

			if (result == (int) result) System.out.printf("Efficiency ratio is %d%%.\n", (int) result);
			else System.out.printf("Efficiency ratio is %.1f%%.\n", result);
		}
	}

	private double operate() {
		double a = 0;
		double r = 0;

		String tmp = sc.nextLine();

		while (!tmp.equals("")) {
			a += tmp.length();
			r += tmp.replaceAll("#", "").length();

			if (!sc.hasNextLine()) break;
			tmp = sc.nextLine();
		}

		return 100 * r / a;
	}

	public static void main(String[] args) {
		new T03448___CharacterRecognition().solve();
	}
}
