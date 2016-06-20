package baekjoon.solve;
import java.util.Scanner;

public class P10434___HappyPrimeNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		boolean[] p = new boolean[10001];
		prime(p, 10001);

		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int a = sc.nextInt();
			int n = sc.nextInt();

			System.out.printf("%d %d %s\n", a, n, (!p[n] && isHappy(n)) ? "YES" : "NO");
		}
	}

	private boolean isHappy(int n) {
		boolean[] a = new boolean[325];
		while (true) {
			int r = 0;
			while (n > 0) {
				r += (n % 10) * (n % 10);
				n /= 10;
			}
			if (r == 1) return true;
			if (a[r]) return false;
			a[r] = true;
			n = r;
		}
	}

	private void prime(boolean[] p, int n) {
		p[1] = true;
		for (int i = 2; i < n; i++) {
			if (!p[i]) update(p, i, n);
		}
	}

	private void update(boolean[] p, int i, int n) {
		for (int k = i * 2; k < n; k += i) {
			p[k] = true;
		}
	}

	public static void main(String[] args) {
		new P10434___HappyPrimeNumber().solve();
	}
}
