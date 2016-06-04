package baekjoon.solve;
import java.util.Scanner;

public class P01890___Jump {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		long[][] d = new long[n][n];
		System.out.println(search(d, a, n, 0, 0));
	}

	private long search(long[][] d, int[][] a, int n, int i, int j) {
		if (i < 0 || j < 0 || i >= n || j >= n) return 0;
		if (i == n - 1 && j == n - 1) return 1;
		if (a[i][j] == 0) return 0;
		if (d[i][j] != 0) return d[i][j];
		return d[i][j] = search(d, a, n, i + a[i][j], j) + search(d, a, n, i, j + a[i][j]);
	}

	public static void main(String[] args) {
		new P01890___Jump().solve();
	}
}
