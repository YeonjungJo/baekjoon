package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P04344___BetterThanAverage {

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int[] p = new int[n];
			double avg = 0;
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				avg += p[i];
			}
			avg /= n;
			Arrays.sort(p);

			int better = search(p, avg, n, 0, n - 1);
			System.out.printf("%.03f", 100 * (n - better) / (float) n);
			System.out.println("%");
		}
	}

	private int search(int[] p, double avg, int n, int start, int end) {
		if (start > end) return n;
		int k = (start + end) / 2;

		int c = compare(p, avg, k);
		if (c == 0) return k;
		if (c == 1) return search(p, avg, n, k + 1, end);
		return search(p, avg, n, start, k - 1);
	}

	private int compare(int[] p, double avg, int k) {
		if (p[k] > avg) {
			if (k > 0) {
				if (p[k - 1] <= avg) return 0;
				return -1;
			}
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P04344___BetterThanAverage().solve();
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
