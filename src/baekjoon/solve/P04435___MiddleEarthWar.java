package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P04435___MiddleEarthWar {

	private void solve() {
		int testcase = sc.nextInt();

		int[] n = { 1, 2, 3, 3, 4, 10 };
		int[] m = { 1, 2, 2, 2, 3, 5, 10 };

		for (int t = 1; t <= testcase; t++) {
			int a = 0;
			for (int i = 0; i < n.length; i++) {
				a += sc.nextInt() * n[i];
			}
			int b = 0;
			for (int i = 0; i < m.length; i++) {
				b += sc.nextInt() * m[i];
			}
			if (a > b) System.out.printf("Battle %d: Good triumphs over Evil\n", t);
			else if (a < b) System.out.printf("Battle %d: Evil eradicates all trace of Good\n", t);
			else System.out.printf("Battle %d: No victor on this battle field\n", t);
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P04435___MiddleEarthWar().solve();
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
