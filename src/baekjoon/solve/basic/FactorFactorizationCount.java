package baekjoon.solve.basic;

import java.util.Scanner;

public class FactorFactorizationCount {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(count(n, m));
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

	public static void main(String[] args) {
		new FactorFactorizationCount().solve();
	}
}
