package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01912___ContinuousSum {

	private void solve() {
		int testcase = sc.nextInt();

		long max = Long.MIN_VALUE;
		long tmp = 0;
		for (int t = 0; t < testcase; t++) {
			if (tmp < 0) tmp = sc.nextInt();
			else tmp += sc.nextInt();
			if (tmp > max) max = tmp;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		sc.init();
		new P01912___ContinuousSum().solve();
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
