package baekjoon.solve;
import java.util.Scanner;

public class P01456___AlmostPrimeNumber {

	private static final Scanner sc = new Scanner(System.in);

	private static final int SIZE = 10000001;

	private void solve() {
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		int[] prime = new int[SIZE];
		long k = init(prime, b);

		long count = 0;
		for (int i = 0; i < k; i++) {
			count += check(prime[i], a, b);
		}

		System.out.println(count);
	}

	private long check(int p, double a, double b) {
		long k = p;
		if (b / p >= k) k *= p;
		else return 0;

		long count = 0;
		while (k <= b) {
			if (k >= a) count++;
			if (b / p >= k) k *= p;
			else return count;
		}
		return count;
	}

	private long init(int[] prime, double b) {
		boolean[] p = new boolean[SIZE];
		int k = 0;
		for (int i = 2; i <= Math.sqrt(b); i++) {
			if (!p[i]) {
				prime[k++] = i;
				update(p, i);
			}
		}
		return k;
	}

	private void update(boolean[] p, int k) {
		for (int i = k; i < SIZE; i += k)
			p[i] = true;
	}

	public static void main(String[] args) {
		new P01456___AlmostPrimeNumber().solve();
	}
}
