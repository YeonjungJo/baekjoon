package baekjoon.solve;
import java.util.Scanner;

public class P01051___SquareNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] a = new char[n][m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int tmp = search(a, n, m, i, j, max);
				if (max < tmp) max = tmp;
			}
		}

		System.out.println((int) Math.pow(max + 1, 2));
	}

	private int search(char[][] a, int n, int m, int i, int j, int max) {
		for (int k = (n < m ? n : m); k > max; k--) {
			if (n - i <= max || m - j <= max) return 0;
			if (i + k >= n || j + k >= m) continue;
			if (a[i][j] == a[i][j + k] && a[i][j] == a[i + k][j] && a[i][j] == a[i + k][j + k]) { return k; }
		}
		return 0;
	}

	public static void main(String[] args) {
		new P01051___SquareNumber().solve();
	}
}