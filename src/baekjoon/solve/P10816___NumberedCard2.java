package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10816___NumberedCard2 {

	private void solve() {
		int n = sc.nextInt();
		int[] have = new int[20000001];
		for (int i = 0; i < n; i++) {
			have[sc.nextInt() + 10000000]++;
		}
		n = sc.nextInt();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			strBuilder.append(have[sc.nextInt() + 10000000] + " ");
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		sc.init();
		new P10816___NumberedCard2().solve();
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
