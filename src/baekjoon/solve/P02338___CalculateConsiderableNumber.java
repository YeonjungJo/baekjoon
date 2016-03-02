package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P02338___CalculateConsiderableNumber {

	private void solve() {
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}

	public static void main(String[] args) {
		sc.init();
		new P02338___CalculateConsiderableNumber().solve();
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

		static BigInteger nextBigInteger() {
			return new BigInteger(next());
		}
	}
}
