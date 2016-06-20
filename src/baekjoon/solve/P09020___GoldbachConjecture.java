package baekjoon.solve;
import java.util.Scanner;

public class P09020___GoldbachConjecture {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {

			int n = sc.nextInt();

			operate(n);
		}
	}

	private void operate(int n) {
		if (n == 4) {
			System.out.println(2 + " " + 2);
			return;
		}

		int t = n / 2;
		for (int i = -(t % 2 - 1); i <= t; i += 2) {
			if (isFactor(t - i) && isFactor(t + i)) {
				System.out.printf("%d %d\n", t - i, t + i);
				return;
			}
		}
	}

	private boolean isFactor(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P09020___GoldbachConjecture().solve();
	}
}
