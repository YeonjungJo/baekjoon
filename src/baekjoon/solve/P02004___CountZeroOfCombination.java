package baekjoon.solve;

import java.util.Scanner;

public class P02004___CountZeroOfCombination {

	private static final Scanner sc = new Scanner(System.in);

	// http://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		long a = get(n, 2) - get(m, 2) - get(n - m, 2);
		long b = get(n, 5) - get(m, 5) - get(n - m, 5);

		System.out.println(a < b ? a : b);
	}

	private long get(int n, int k) {
		long count = 0;

		long i = k;
		while (n / i >= 1) {
			count += n / i;
			i *= k;
		}
		return count;
	}

	public static void main(String[] args) {
		new P02004___CountZeroOfCombination().solve();
	}
}
