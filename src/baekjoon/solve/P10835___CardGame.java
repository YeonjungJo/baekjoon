package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10835___CardGame {

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		int[][] d = new int[n][n];
		System.out.println(search(d, a, b, n, 0, 0));
	}

	private int search(int[][] d, int[] a, int[] b, int n, int i, int j) {
		if (i >= n || j >= n) return 0;
		if (d[i][j] != 0) {
			if (d[i][j] == -1) return 0;
			return d[i][j];
		}
		if (a[i] > b[j]) return d[i][j] = b[j] + search(d, a, b, n, i, j + 1);
		return max(d, i, j, search(d, a, b, n, i + 1, j + 1), search(d, a, b, n, i + 1, j));
	}

	private int max(int[][] d, int a, int b, int i, int j) {
		if (i == 0 && j == 0) {
			d[a][b] = -1;
			return 0;
		}
		return d[a][b] = i > j ? i : j;
	}

	public static void main(String[] args) {
		sc.init();
		new P10835___CardGame().solve();
	}

	static class sc {
		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {}
			}

			return st.nextToken();
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
