package baekjoon.todo;

import java.util.Scanner;

public class T01926___Picture {

	/*
	 * Testcase_01926
	 */

	private static final Scanner sc = new Scanner(System.in);
	private static final int[][] DIR = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] a = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (sc.nextInt() == 1) a[i][j] = true;
			}
		}

		int cnt = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j]) {
					cnt++;
					int size = search(a, n, m, i, j);
					if (size > max) max = size;
				}
			}
		}

		System.out.println(cnt);
		System.out.println(max);
	}

	private int search(boolean[][] a, int n, int m, int i, int j) {
		if (i < 0 || j < 0 || i >= n || j >= m) return 0;
		if (!a[i][j]) return 0;
		a[i][j] = false;
		int sum = 1;
		for (int k = 0; k < DIR.length; k++) {
			sum += search(a, n, m, i + DIR[k][0], j + DIR[k][1]);
		}
		return sum;
	}

	public static void main(String[] args) {
		new T01926___Picture().solve();
	}
}
