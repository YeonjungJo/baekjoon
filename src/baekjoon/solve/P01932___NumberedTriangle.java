package baekjoon.solve;

import java.util.Scanner;

public class P01932___NumberedTriangle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int x = n - 1; x > 0; x--) {
			for (int y = 0; y < x; y++) {
				if (a[x][y] > a[x][y + 1]) {
					a[x - 1][y] += a[x][y];
				} else {
					a[x - 1][y] += a[x][y + 1];
				}
			}
		}

		System.out.println(a[0][0]);
	}

	public static void main(String[] args) {
		new P01932___NumberedTriangle().solve();
	}
}