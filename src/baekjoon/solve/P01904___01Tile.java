package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01904___01Tile {

	private void solve() {
		int n = Scanner.nextInt();
		int[] d = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i <= 3) {
				d[i] = i;
				continue;
			}
			d[i] = (d[i - 2] + d[i - 1]) % 15746;
		}

		System.out.println(d[n]);
	}

	public static void main(String[] args) {
		Scanner.init();
		new P01904___01Tile().solve();
	}

	static class Scanner {
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
