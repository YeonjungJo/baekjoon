package baekjoon.solve;
import java.util.Scanner;

public class P11057___AscentNumber {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NOT_AVAILABLE = 0;
	private static final int MOD_VALUE = 10007;

	private void solve() {
		int n = sc.nextInt();
		int[][] d = new int[n][10];

		search(d, n, 0, 0);
		System.out.println(d[0][0]);
	}

	private int search(int[][] d, int size, int n, int p) {
		if (p >= size) return NOT_AVAILABLE;
		if (d[p][n] != 0) return d[p][n];
		if (p == size - 1) return d[p][n] = 10 - n;

		int sum = 0;
		for (int i = n; i < 10; i++) {
			sum = add(sum, search(d, size, i, p + 1));
		}
		return d[p][n] = sum;
	}

	private int add(int a, int b) {
		return (a + b) % MOD_VALUE;
	}

	public static void main(String[] args) {
		new P11057___AscentNumber().solve();
	}
}
