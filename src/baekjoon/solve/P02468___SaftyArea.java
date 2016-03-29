package baekjoon.solve;
import java.util.Scanner;

public class P02468___SaftyArea {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int min = 101;
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
				if (a[i][j] > max) max = a[i][j];
				if (a[i][j] < min) min = a[i][j];
			}
		}

		int result = 0;
		for (int i = min; i <= max; i++) {
			int tmp = get(a, n, i);
			if (tmp > result) result = tmp;
		}

		System.out.println(result);
	}

	private int get(int[][] a, int n, int h) {
		boolean[][] d = new boolean[n][n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] >= h && !d[i][j]) {
					search(d, a, n, i, j, h);
					count++;
				}
			}
		}
		return count;
	}

	private void search(boolean[][] d, int[][] a, int n, int i, int j, int h) {
		if (i < 0 || j < 0 || i >= n || j >= n) return;
		if (a[i][j] < h) return;
		if (d[i][j]) return;
		d[i][j] = true;
		search(d, a, n, i + 1, j, h);
		search(d, a, n, i - 1, j, h);
		search(d, a, n, i, j + 1, h);
		search(d, a, n, i, j - 1, h);
	}

	public static void main(String[] args) {
		new P02468___SaftyArea().solve();
	}
}
