package baekjoon.solve;
import java.util.Scanner;

public class P01388___Flooring {

	private static final Scanner sc = new Scanner(System.in);

	private static final int HORIZONTAL = 1;
	private static final int VERTICAL = 2;
	private static final int CHECKED = 0;

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] floor = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				floor[i][j] = s.charAt(j) == '-' ? HORIZONTAL : VERTICAL;
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (floor[i][j] != CHECKED) {
					search(floor, n, m, i, j, floor[i][j]);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

	private void search(int[][] floor, int n, int m, int i, int j, int k) {
		if (i < 0 || j < 0 || i >= n || j >= m) return;
		if (floor[i][j] != k) return;

		floor[i][j] = CHECKED;

		if (k == HORIZONTAL) search(floor, n, m, i, j + 1, k);
		if (k == VERTICAL) search(floor, n, m, i + 1, j, k);
	}

	public static void main(String[] args) {
		new P01388___Flooring().solve();
	}
}
