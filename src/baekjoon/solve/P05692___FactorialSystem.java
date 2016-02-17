package baekjoon.solve;
import java.util.Scanner;

public class P05692___FactorialSystem {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] FACTORIAL_BASE = { 1, 2, 6, 24, 120 };

	private void solve() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;

			int result = 0;
			for (int i = 0; n > 0; i++) {
				result += (n % 10) * FACTORIAL_BASE[i];
				n /= 10;
			}
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		new P05692___FactorialSystem().solve();
	}
}
