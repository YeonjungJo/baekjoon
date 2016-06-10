package baekjoon.todo;
import java.util.Scanner;

public class T07806___GCDFactorial {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			System.out.println(gcd(n, k));
		}
	}

	private long gcd(int n, int k) {
		if (n >= k) return k;

		int gcd = 1;
		for (int i = 2; i <= k; i++) {
			if (k % i == 0) {
				int tmp = get(k, i);
				k /= Math.pow(i, tmp);
				gcd *= Math.pow(i, getFactory(n, i, tmp));
			}
		}
		return gcd;
	}

	private int get(int k, int p) {
		int count = 0;
		int i = p;
		while (k % i == 0) {
			count++;
			i *= p;
		}
		return count;
	}

	private int getFactory(int n, int p, int k) {
		int count = 0;

		long i = p;
		while (n / i >= 1) {
			count += n / i;
			if (count >= k) return k;
			i *= p;
		}
		return count;
	}

	public static void main(String[] args) {
		new T07806___GCDFactorial().solve();
	}
}
