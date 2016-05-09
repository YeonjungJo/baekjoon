package baekjoon.solve;
import java.util.Scanner;

public class P01937___GreedyPanda {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[][] DIR = { { -1, 0 }, { +1, 0 }, { 0, -1 }, { 0, +1 } };
	private static final int DIR_I = 0;
	private static final int DIR_J = 1;

	private static final int NO_PATH = -1;

	private void solve() {
		int n = sc.nextInt();

		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int max = 0;

		int[][] d = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (d[i][j] == 0) {
					search(d, a, n, i, j, 0);
					if (d[i][j] > max) max = d[i][j];
				}
			}
		}

		System.out.println(1 + max);
	}

	private int search(int[][] d, int[][] a, int n, int i, int j, int cost) {
		if (i < 0 || j < 0 || i >= n || j >= n || a[i][j] <= cost) return NO_PATH;
		if (d[i][j] != 0) return d[i][j];

		int max = NO_PATH;
		for (int k = 0; k < DIR.length; k++) {
			int tmp = 1 + search(d, a, n, i + DIR[k][DIR_I], j + DIR[k][DIR_J], a[i][j]);
			if (tmp > max) max = tmp;
		}
		return d[i][j] = max;
	}

	public static void main(String[] args) {
		new P01937___GreedyPanda().solve();
	}
}
