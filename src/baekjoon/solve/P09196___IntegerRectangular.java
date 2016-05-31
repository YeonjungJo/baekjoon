package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P09196___IntegerRectangular {

	private void solve() {
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 && w == 0) return;

			int diag = h * h + w * w;
			getNextRect(diag, h);
		}
	}

	private void getNextRect(int diag, int h) {
		while (true) {
			if (getNextHeight(diag, h)) return;
			diag++;
			h = 0;
		}
	}

	private boolean getNextHeight(int diag, int h) {
		for (int i = h + 1;; i++) {
			int tmp = i * i;
			double width = Math.sqrt(diag - tmp);
			if (i >= width) return false;
			if (width == (int) width) {
				System.out.printf("%d %d\n", i, (int) width);
				return true;
			}
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P09196___IntegerRectangular().solve();
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
