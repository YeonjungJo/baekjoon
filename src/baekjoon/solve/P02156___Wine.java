package baekjoon.solve;
import java.util.Scanner;

public class P02156___Wine {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] wine = new int[n];
		for (int i = 0; i < n; i++) {
			wine[i] = sc.nextInt();
		}

		int[][] d = new int[n][3];
		find(wine, d, 0, 0);
		System.out.println(d[0][0]);
	}

	private int find(int[] wine, int[][] d, int i, int j) {
		if (i >= wine.length) return 0;
		if (j == 2) return d[i][2] = find(wine, d, i + 1, 0);
		if (d[i][j] != 0) return d[i][j];
		return d[i][j] = max(wine[i] + find(wine, d, i + 1, j + 1), find(wine, d, i + 1, 0));
	}

	private int max(int i, int j) {
		return i > j ? i : j;
	}

	public static void main(String[] args) {
		new P02156___Wine().solve();
	}
}
