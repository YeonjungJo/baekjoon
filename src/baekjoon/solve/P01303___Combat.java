package baekjoon.solve;
import java.util.Scanner;

public class P01303___Combat {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] x = { -1, +1, 0, 0 };
	private static final int[] y = { 0, 0, -1, +1 };

	private void solve() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] combat = new char[n][m];
		for (int i = 0; i < n; i++) {
			combat[i] = sc.next().toCharArray();
		}

		long b = 0;
		long w = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (combat[i][j] == 'B') b += Math.pow(find(combat, n, m, i, j, 'B'), 2);
				if (combat[i][j] == 'W') w += Math.pow(find(combat, n, m, i, j, 'W'), 2);
			}
		}

		System.out.println(w);
		System.out.println(b);
	}

	private long find(char[][] combat, int n, int m, int i, int j, char c) {
		if (i < 0 || j < 0 || i >= n || j >= m) return 0;
		if (combat[i][j] != c) return 0;
		combat[i][j] = '0';

		int count = 0;
		for (int a = 0; a < 4; a++) {
			count += find(combat, n, m, i + x[a], j + y[a], c);
		}
		return 1 + count;
	}

	public static void main(String[] args) {
		new P01303___Combat().solve();
	}
}
