package baekjoon.solve;
import java.util.Scanner;

public class P02579___StairClimb {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[][] d = new int[n][2];
		System.out.println(search(d, a, n - 1, 0));
	}

	private int search(int[][] d, int[] a, int i, int l) {
		if (i < 0 || l > 1) return 0;
		if (d[i][l] != 0) return d[i][l];
		return d[i][l] = a[i] + max(search(d, a, i - 1, l + 1), search(d, a, i - 2, 0));
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		new P02579___StairClimb().solve();
	}
}
