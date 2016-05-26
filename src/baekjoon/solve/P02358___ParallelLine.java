package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P02358___ParallelLine {

	private void solve() {
		int n = sc.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		Arrays.sort(x);
		Arrays.sort(y);

		int count = 0;
		int tmpX = x[0];
		int tmpY = y[0];
		boolean rX = false;
		boolean rY = false;
		for (int i = 1; i < n; i++) {
			if (tmpX == x[i] && !rX) {
				count++;
				rX = true;
			}
			if (tmpX != x[i]) rX = false;
			if (tmpY == y[i] && !rY) {
				count++;
				rY = true;
			}
			if (tmpY != y[i]) rY = false;
			tmpX = x[i];
			tmpY = y[i];
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		sc.init();
		new P02358___ParallelLine().solve();
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
