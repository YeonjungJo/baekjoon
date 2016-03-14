package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P04158___CD {

	private void solve() {
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) return;

			int[] sang = new int[n];
			int[] sun = new int[m];

			for (int k = 0; k < n; k++) {
				sang[k] = sc.nextInt();
			}
			for (int k = 0; k < n; k++) {
				sun[k] = sc.nextInt();
			}

			int count = 0;
			int i = 0;
			int j = 0;

			while (i < n && j < m) {
				if (sang[i] > sun[j]) {
					j++;
				} else if (sang[i] < sun[j]) {
					i++;
				} else if (sang[i] == sun[j]) {
					i++;
					j++;
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P04158___CD().solve();
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