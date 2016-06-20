package baekjoon.solve;
import java.util.Scanner;

public class P05679___HailstoneSequence {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;

			int max = n;

			while (n != 1) {
				if (n % 2 == 0) n /= 2;
				else n = n * 3 + 1;
				if (n > max) max = n;
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new P05679___HailstoneSequence().solve();
	}
}
