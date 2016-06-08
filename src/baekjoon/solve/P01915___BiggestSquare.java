package baekjoon.solve;
import java.util.Scanner;

public class P01915___BiggestSquare {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NOT_AVAILABLE = 0;
	private static final int MAX_VALUE = 1000;

	private static final int[][] DIR = { { 1, 0 }, { 1, 1 }, { 0, 1 } };

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] a = new char[n][m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}

		int max = 0;
		int[][] d = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == '1') {
					int tmp = search(d, a, n, m, i, j);
					if (tmp > max) max = tmp;
				}
			}
		}

		System.out.println(max * max);
	}

	private int search(int[][] d, char[][] a, int n, int m, int i, int j) {
		if (i >= n || j >= m || a[i][j] == '0') return NOT_AVAILABLE;

		if (d[i][j] != 0) return d[i][j];

		int min = MAX_VALUE;
		for (int dir = 0; dir < DIR.length; dir++) {
			int tmp = search(d, a, n, m, i + DIR[dir][0], j + DIR[dir][1]);
			if (tmp < min) min = tmp;
		}
		return d[i][j] = 1 + min;
	}

	public static void main(String[] args) {
		new P01915___BiggestSquare().solve();
	}
}
