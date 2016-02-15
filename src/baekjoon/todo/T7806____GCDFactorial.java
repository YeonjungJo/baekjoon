package baekjoon.todo;

import java.util.Scanner;

public class T7806____GCDFactorial {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNext()) {
			long n = sc.nextLong();
			long k = sc.nextLong();

			// long gcd = 1;
			// while (n > 1) {
			// if (k <= n) {
			// gcd *= k;
			// break;
			// }
			// if (k % n == 0) {
			// gcd *= n;
			// k /= n;
			// }
			// n--;
			// }

			System.out.println(findGCD(n, k));
		}
	}

	private long findGCD(long n, long k) {
		long gcd = 1;
		for (int i = 0; i < k; i++) {
			
		}
		return gcd;
	}

	public static void main(String[] args) {
		new T7806____GCDFactorial().solve();
	}
}
