package baekjoon.solve;
import java.util.Scanner;

public class P01644___SequentialSumOfPrimeNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] prime = new int[n + 1];
		int k = init(n, prime);

		int count = 0;

		int h = 0;
		int t = 0;
		int sum = prime[0];

		while (h >= t && h < k) {
			if (sum < n) sum += prime[++h];
			else if (sum > n) sum -= prime[t++];
			else {
				count++;
				sum -= prime[t++];
			}
		}

		System.out.println(count);
	}

	private int init(int n, int[] prime) {
		boolean[] p = new boolean[n + 1];
		int k = 0;
		for (int i = 2; i <= n; i++) {
			if (!p[i]) {
				prime[k++] = i;
				update(p, n, i);
			}
		}
		return k;
	}

	private void update(boolean[] p, int n, int k) {
		for (int i = k; i <= n; i += k)
			p[i] = true;
	}

	public static void main(String[] args) {
		new P01644___SequentialSumOfPrimeNumber().solve();
	}
}