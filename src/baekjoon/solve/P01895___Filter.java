package baekjoon.solve;
import java.util.Scanner;

public class P01895___Filter {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int t = sc.nextInt();

		int[][] b = new int[r][c - 2];
		for (int i = 0; i < r; i++) {
			int cnt = 0;
			if (a[i][0] >= t) cnt++;
			if (a[i][1] >= t) cnt++;
			for (int j = 2; j < c; j++) {
				if (a[i][j] >= t) cnt++;
				if (j != 2 && a[i][j - 3] >= t) cnt--;
				b[i][j-2] = cnt;
			}
		}

		int result = 0;
		for (int i = 0; i < r - 2; i++) {
			for (int j = 0; j < c - 2; j++) {
				if (check(b, i, j)) result++;
			}
		}

		System.out.println(result);
	}

	private boolean check(int[][] b, int i, int j) {
		if (b[i][j] + b[i + 1][j] + b[i + 2][j] < 5) return false;
		return true;
	}

	public static void main(String[] args) {
		new P01895___Filter().solve();
	}
}
