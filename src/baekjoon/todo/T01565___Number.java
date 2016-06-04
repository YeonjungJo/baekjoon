package baekjoon.todo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T01565___Number {

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		long lcm = sc.nextInt();
		for (int i = 1; i < n; i++) {
			lcm = lcm(lcm, sc.nextInt());
			if (lcm > 1000000000) {
				System.out.println(0);
				return;
			}
		}

		int gcd = sc.nextInt();
		for (int i = 1; i < m; i++) {
			gcd = gcd(gcd, sc.nextInt());
		}

		if (lcm > gcd) {
			System.out.println(0);
			return;
		}

		int count = 0;
		for (int i = (int) lcm; i <= gcd; i++) {
			if (gcd % i == 0 && i % lcm == 0) count++;
		}
		System.out.println(count);
	}

	private int gcd(int a, int b) {
		int gcd = 1;
		for (int i = 2; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd *= i;
				a /= i;
				b /= i;
				i--;
			}
		}
		return gcd;
	}

	private long lcm(long a, long b) {
		int gcd = 1;
		for (int i = 2; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
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
		new T01565___Number().solve();
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
