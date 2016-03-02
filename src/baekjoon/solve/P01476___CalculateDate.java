package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01476___CalculateDate {

	private void solve() {
		Scanner.init();
		int e = Scanner.nextInt();
		int s = Scanner.nextInt();
		int m = Scanner.nextInt();

		for (int i = 0;; i++) {
			int x = 15 * i + e;
			if ((x - s) % 28 == 0 && (x - m) % 19 == 0) {
				System.out.println(x);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P01476___CalculateDate().solve();
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
