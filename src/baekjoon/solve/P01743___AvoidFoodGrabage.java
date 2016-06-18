package baekjoon.solve;
import java.util.Scanner;

public class P01743___AvoidFoodGrabage {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		boolean[][] d = new boolean[n][m];
		for (int i = 0; i < k; i++) {
			d[sc.nextInt() - 1][sc.nextInt() - 1] = true;
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (d[i][j]) {
					int tmp = search(d, n, m, i, j);
					if (tmp > max) max = tmp;
				}
			}
		}
		
		System.out.println(max);
	}

	private int search(boolean[][] d, int n, int m, int i, int j) {
		if (i < 0 || j < 0 || i >= n || j >= m || !d[i][j]) return 0;

		d[i][j] = false;

		int sum = 1;
		sum += search(d, n, m, i - 1, j);
		sum += search(d, n, m, i + 1, j);
		sum += search(d, n, m, i, j - 1);
		sum += search(d, n, m, i, j + 1);
		return sum;
	}

	public static void main(String[] args) {
		new P01743___AvoidFoodGrabage().solve();
	}
}
