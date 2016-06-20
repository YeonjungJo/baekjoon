package baekjoon.solve;
import java.util.Scanner;

public class P06662___Divisor {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int r = sc.nextInt();

			boolean[] p = new boolean[n + 1];
			setPrimeNumber(p, n);

			long sum = 1;
			for (int i = 2; i <= n; i++) {
				if (!p[i]) sum *= (1 + get(i, n, r));
			}
			System.out.println(sum);
		}
	}

	private long get(int i, int n, int r) {
		return count(n, i) - count(r, i) - count(n - r, i);
	}

	private long count(int n, int k) {
		long count = 0;

		long i = k;
		while (n / i >= 1) {
			count += n / i;
			i *= k;
		}
		return count;
	}

	private void setPrimeNumber(boolean[] p, int n) {
		for (int i = 2; i <= n; i++) {
			if (!p[i]) set(p, n, i);
		}
	}

	private void set(boolean[] p, int n, int i) {
		for (int k = 2 * i; k <= n; k += i) {
			p[k] = true;
		}
	}

	public static void main(String[] args) {
		new P06662___Divisor().solve();
	}
}
