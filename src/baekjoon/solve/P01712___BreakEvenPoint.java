package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01712___BreakEvenPoint {

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (c - b <= 0) {
			System.out.println(-1);
			return;
		}

		System.out.println((a / (c - b)) + 1);
	}

	public static void main(String[] args) {
		sc.init();
		new P01712___BreakEvenPoint().solve();
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
