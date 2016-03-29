package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P02776___KingOfMemorization {

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int[] memo = new int[n];
			for (int i = 0; i < n; i++) {
				memo[i] = sc.nextInt();
			}
			Arrays.sort(memo);
			StringBuilder stringBuilder = new StringBuilder();
			int m = sc.nextInt();
			for (int j = 0; j < m; j++) {
				stringBuilder.append(search(memo, sc.nextInt(), 0, memo.length - 1) ? "1" : "0").append("\n");
			}
			System.out.printf(stringBuilder.toString());
		}
	}

	private boolean search(int[] d, int i, int start, int end) {
		int k = (start + end) / 2;
		while (true) {
			if (start > end) return false;
			if (d[k] == i) return true;
			if (d[k] > i) {
				return search(d, i, start, k - 1);
			} else {
				return search(d, i, k + 1, end);
			}
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P02776___KingOfMemorization().solve();
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