package baekjoon.solve;
import java.util.Scanner;

public class P05533___Unique {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] d = new int[4][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				d[j][i] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = d[i][j];
				for (int k = j + 1; k < n; k++) {
					if (tmp == d[i][k]) d[i][j] = d[i][k] = 0;
				}
				d[3][j] += d[i][j];
			}
		}

		for (int i = 0; i < n; i++)
			System.out.println(d[3][i]);
	}

	public static void main(String[] args) {
		new P05533___Unique().solve();
	}
}
