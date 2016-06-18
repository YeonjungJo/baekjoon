package baekjoon.solve;
import java.util.Scanner;

public class P11048___Move {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int[][] d = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				d[i][j] = a[i][j] + max(d, i, j);
			}
		}
		System.out.println(d[n - 1][m - 1]);
	}

	private int max(int[][] d, int i, int j) {
		if (i == 0) {
			if (j == 0) return 0;
			return d[i][j - 1];
		}
		if (j == 0) return d[i - 1][j];
		return d[i - 1][j] > d[i][j - 1] ? d[i - 1][j] : d[i][j - 1];
	}

	public static void main(String[] args) {
		new P11048___Move().solve();
	}
}
