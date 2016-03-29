package baekjoon.todo;
import java.util.Scanner;

public class T01011___Attacker {

	private static final Scanner sc = new Scanner(System.in);
	
	/*
	 * 1
	 * 3 10
	 * 3 1 2
	 * 9 1 5
	 */

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int w = sc.nextInt();

			int[][] a = new int[2][n];

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println(search(a, n, w));
		}
	}

	private int search(int[][] a, int n, int w) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[0][i] == w + 1) continue;
			count++;
			int x = get(a, n, w, 0, i, 0, i - 1);
			int y = get(a, n, w, 0, i, 0, i + 1);
			int z = get(a, n, w, 0, i, 1, i);

			if (x != -1 || y != -1 || z != -1) {
				if (x >= y && x >= z) {
					if (i - 1 >= 0) a[0][i - 1] = w + 1;
					else a[0][n - 1] = w + 1;
				} else if (y > x && y >= z) {
					if (i + 1 < n) a[0][i + 1] = w + 1;
					else a[0][0] = w + 1;
				} else {
					a[1][i] = w + 1;
				}
			}
			a[0][i] = w + 1;
		}
		for (int i = 0; i < n; i++) {
			if (a[1][i] == w + 1) continue;
			count++;
			int x = get(a, n, w, 1, i, 1, i - 1);
			int y = get(a, n, w, 1, i, 1, i + 1);

			if (x != -1 || y != -1) {
				if (x >= y) {
					if (i - 1 >= 0) a[1][i - 1] = w + 1;
					else a[1][n - 1] = w + 1;
				} else {
					if (i + 1 < n) a[1][i + 1] = w + 1;
					else a[1][0] = w + 1;
				}
			}
			a[1][i] = w + 1;
		}
		return count;
	}

	private int get(int[][] a, int n, int w, int currenti, int currentj, int neighbori, int neighborj) {
		if (neighborj < 0) neighborj = n - 1;
		if (neighborj == n) neighborj = 0;
		if (currentj == neighborj && currenti == neighbori) return -1;
		int result = a[currenti][currentj] + a[neighbori][neighborj];
		return result <= w ? result : -1;
	}

	public static void main(String[] args) {
		new T01011___Attacker().solve();
	}
}
