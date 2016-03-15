package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01124___UnderPrime {

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();

		int count = 0;
		for (int i = a; i <= b; i++) {
			int factor = countFactor(i);
			if (factor > 1 && isPrimeNumber(factor)) count++;
		}
		System.out.println(count);
	}

	private boolean isPrimeNumber(int factor) {
		for (int i = 2; i <= Math.sqrt(factor); i++) {
			if (factor % i == 0) return false;
		}
		return true;
	}

	private int countFactor(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
				n /= i;
				i = 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		sc.init();
		new P01124___UnderPrime().solve();
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
