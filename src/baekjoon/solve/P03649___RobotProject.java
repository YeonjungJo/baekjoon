package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P03649___RobotProject {

	private void solve() throws IOException {
		String s;
		while ((s = sc.br.readLine()) != null) {
			long hole = Long.parseLong(s) * 10000000;
			int n = sc.nextInt();
			long[] lego = new long[n];
			for (int i = 0; i < n; i++) {
				lego[i] = sc.nextLong();
			}

			Arrays.sort(lego);
			search(lego, hole, n);
		}
	}

	private void search(long[] lego, long hole, int n) {
		for (int i = 0; i < n; i++) {
			if (binarySearch(lego, hole, lego[i], i + 1, n - 1)) return;
		}
		System.out.println("danger");
	}

	private boolean binarySearch(long[] lego, long hole, long i, int start, int end) {
		int k = (start + end) / 2;
		if (start > end || k < 0 || k > lego.length) return false;
		if (i + lego[k] == hole) {
			System.out.printf("yes %d %d\n", i, lego[k]);
			return true;
		} else if (i + lego[k] < hole) {
			return binarySearch(lego, hole, i, k + 1, end);
		} else {
			return binarySearch(lego, hole, i, start, k - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		sc.init();
		new P03649___RobotProject().solve();
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

		static long nextLong() {
			return Long.parseLong(next());
		}
	}

}