package baekjoon.solve;
import java.util.Scanner;

public class P04948___BetrandPostulate {

	private static final Scanner sc = new Scanner(System.in);

	private static int NULL = 0;
	private static int PRIME = 1;
	private static int NOT_PRIME = 2;

	private void solve() {
		int[] p = new int[123456 * 2 + 1];
		int[] d = new int[123456 + 1];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;
			get(d, p, n);
		}
	}

	private void get(int[] d, int[] p, int n) {
		if (d[n] == 0) search(d, p, n);
		System.out.println(d[n]);
	}

	private void search(int[] d, int[] p, int n) {
		int count = 0;
		for (int i = n + 1; i <= 2 * n; i++) {
			if (isPrime(p, i)) count++;
		}
		d[n] = count;
	}

	private boolean isPrime(int[] p, int n) {
		if (p[n] != NULL) return p[n] == PRIME ? true : false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (p[i] == NOT_PRIME) continue;
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P04948___BetrandPostulate().solve();
	}
}
