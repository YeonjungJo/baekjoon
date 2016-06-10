package baekjoon.solve;
import java.util.Scanner;

public class P01516___GameDevelopment {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		boolean[][] order = new boolean[n][n];
		int[] buildTime = new int[n];
		for (int i = 0; i < n; i++) {
			buildTime[i] = sc.nextInt();
			while (true) {
				int k = sc.nextInt();
				if (k == -1) break;
				order[i][k - 1] = true;
			}
		}

		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(search(result, n, order, buildTime, i));
		}
	}

	private int search(int[] result, int n, boolean[][] order, int[] buildTime, int k) {
		if (result[k] != 0) return result[k];

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (order[k][i]) {
				int tmp = search(result, n, order, buildTime, i);
				if (tmp > max) max = tmp;
			}
		}

		return result[k] = buildTime[k] + max;
	}

	public static void main(String[] args) {
		new P01516___GameDevelopment().solve();
	}
}
