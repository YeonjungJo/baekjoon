package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10864___Friend {

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] a = new boolean[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x][y] = a[y][x] = true;
		}

		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (a[i][j]) count++;
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P10864___Friend().solve();
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
