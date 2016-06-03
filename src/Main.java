import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int lcm = 1;
		for (int i = 0; i < n; i++) {
			lcm = lcm(lcm, sc.nextInt());
		}

		int gcd = 1;
		for (int i = 0; i < m; i++) {
			
		}

	}

	private int lcm(int a, int b) {
		int gcd = 1;
		for (int i = 2; i <= a && i <= b; i++) {
			if (a % i == 0 && a % b == 0) {
				gcd *= i;
				a /= i;
				b /= i;
				i--;
			}
		}
		return gcd * a * b;
	}

	public static void main(String[] args) {
		sc.init();
		new Main().solve();
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
