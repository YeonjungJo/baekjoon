package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01940___Jumong {

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] material = new int[10000001];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp < m && material[m - tmp] > 0) {
				count++;
				material[m - tmp]--;
			} else material[tmp]++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		sc.init();
		new P01940___Jumong().solve();
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
