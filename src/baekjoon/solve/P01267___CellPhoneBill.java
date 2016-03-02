package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01267___CellPhoneBill {

	private void solve() {
		int n = sc.nextInt();
		long y = 0;
		long m = 0;
		for (int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			y += (tmp / 30 + 1) * 10;
			m += (tmp / 60 + 1) * 15;
		}

		if (y > m) System.out.printf("M %d \n", m);
		if (y < m) System.out.printf("Y %d \n", y);
		if (y == m) System.out.printf("Y M %d \n", m);
	}

	public static void main(String[] args) {
		sc.init();
		new P01267___CellPhoneBill().solve();
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
