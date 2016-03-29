package baekjoon.solve;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class P02583___SearchArea {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();

		boolean[][] d = new boolean[m][n];

		for (int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			update(d, a, b, x - 1, y - 1);
		}

		LinkedList<Integer> result = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!d[i][j]) result.add(search(d, m, n, i, j));
			}
		}

		Integer[] s = result.toArray(new Integer[result.size()]);
		Arrays.sort(s);

		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

	private int search(boolean[][] d, int m, int n, int i, int j) {
		if (i < 0 || j < 0 || i >= m || j >= n || d[i][j]) return 0;
		d[i][j] = true;
		return 1 + search(d, m, n, i - 1, j) + search(d, m, n, i + 1, j) + search(d, m, n, i, j + 1) + search(d, m, n, i, j - 1);
	}

	private void update(boolean[][] d, int a, int b, int x, int y) {
		for (int i = b; i <= y; i++) {
			for (int j = a; j <= x; j++) {
				d[i][j] = true;
			}
		}
	}

	public static void main(String[] args) {
		new P02583___SearchArea().solve();
	}
}
