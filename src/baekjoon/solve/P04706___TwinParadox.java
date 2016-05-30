package baekjoon.solve;
import java.util.Scanner;

public class P04706___TwinParadox {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if (a == 0 && b == 0) return;

			double gamma = b / a;
			System.out.printf("%.3f\n", Math.sqrt(1 - Math.pow(gamma, 2)));
		}
	}

	public static void main(String[] args) {
		new P04706___TwinParadox().solve();
	}
}
