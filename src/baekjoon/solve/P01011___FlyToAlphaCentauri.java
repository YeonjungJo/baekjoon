package baekjoon.solve;
import java.util.Scanner;

public class P01011___FlyToAlphaCentauri {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			System.out.println(fly(sc.nextInt(), sc.nextInt()));
		}
	}

	private int fly(int start, int end) {
		int k = end - start;

		for (int i = 1;; i++) {
			for (int j = 1; j <= 2; j++) {
				k -= i;
				if (k <= 0) return 2 * (i - 1) + j;
			}
		}
	}

	public static void main(String[] args) {
		new P01011___FlyToAlphaCentauri().solve();
	}
}
