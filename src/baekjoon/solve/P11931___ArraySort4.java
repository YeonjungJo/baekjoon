package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11931___ArraySort4 {

	private void solve() {
		int n = sc.nextInt();
		boolean[] a = new boolean[2000001];
		for (int i = 0; i < n; i++) {
			a[sc.nextInt() + 1000000] = true;
		}
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 2000000; i >= 0; i--) {
			if (a[i]) strBuilder.append(i - 1000000 + "\n");
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		sc.init();
		new P11931___ArraySort4().solve();
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