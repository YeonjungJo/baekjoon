package baekjoon.solve;
import java.util.Scanner;

public class P11052___SellFishShapedBun {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		int[][] d = new int[n + 1][n + 1];
		search(d, a, n, 1, n);
		System.out.println(d[1][n]);
	}

	private int search(int[][] d, int[] a, int n, int current, int remain) {
		if (current > remain) return 0;
		if (current > n) return 0;
		if (d[current][remain] != 0) return d[current][remain];

		int max = 0;
		for (int i = 0; i <= remain; i += current) {
			int tmp = (i / current) * a[current] + search(d, a, n, current + 1, remain - i);
			if (max < tmp) max = tmp;
		}
		return d[current][remain] = max;
	}

	public static void main(String[] args) {
		new P11052___SellFishShapedBun().solve();
	}
}
