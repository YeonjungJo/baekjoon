package baekjoon.solve;

import java.util.Scanner;

public class P05525___IOIOI {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		sc.nextInt();
		String s = sc.next();

		int count = 0;
		int a = 0;
		int b = -1;
		while (a != b) {
			a = s.length();
			s = s.replaceFirst("I(OI)+", "A");
			b = s.length();
			if ((a - b) / 2 - n + 1 > 0) count += (a - b) / 2 - n + 1;
			// System.out.printf("%d, %s, %d ( %d ): %d\n", a, s, b, (a - b) / 2
			// - n, count);
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new P05525___IOIOI().solve();
	}
}
