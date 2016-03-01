package baekjoon.solve;
import java.util.Scanner;

public class P02096___GoDown {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] game = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				game[i][j] = sc.nextInt();
			}
		}

		int[][] d_max = new int[n][3];
		int[][] d_min = new int[n][3];

		for (int i = 0; i < 3; i++) {
			findMax(game, d_max, n, 0, i);
			findMin(game, d_min, n, 0, i);
		}
		System.out.println(max(d_max[0][0], d_max[0][1], d_max[0][2]) + " " + min(d_min[0][0], d_min[0][1], d_min[0][2]));
	}

	private int findMin(int[][] game, int[][] d, int n, int i, int j) {
		if (i < 0 || j < 0 || j >= 3) return Integer.MAX_VALUE;
		if (i >= n) return 0;
		if (d[i][j] != 0) return d[i][j];
		return d[i][j] = game[i][j]
				+ min(findMin(game, d, n, i + 1, j - 1), findMin(game, d, n, i + 1, j), findMin(game, d, n, i + 1, j + 1));
	}

	private int min(int a, int b, int c) {
		return a < b ? a < c ? a : c : b < c ? b : c;
	}

	private int findMax(int[][] game, int[][] d, int n, int i, int j) {
		if (i < 0 || j < 0 || i >= n || j >= 3) return 0;
		if (d[i][j] != 0) return d[i][j];
		return d[i][j] = game[i][j]
				+ max(findMax(game, d, n, i + 1, j - 1), findMax(game, d, n, i + 1, j), findMax(game, d, n, i + 1, j + 1));
	}

	private int max(int a, int b, int c) {
		return a > b ? a > c ? a : c : b > c ? b : c;
	}

	public static void main(String[] args) {
		new P02096___GoDown().solve();
	}
}
