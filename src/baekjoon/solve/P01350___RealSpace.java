package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P01350___RealSpace {

	private void solve() {
		Scanner.init();
		int n = Scanner.nextInt();
		int[] file = new int[n];
		for (int i = 0; i < n; i++) {
			file[i] = Scanner.nextInt();
		}
		int cluster = Scanner.nextInt();

		BigInteger count = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			int a = file[i] / cluster;
			count = count.add(file[i] % cluster == 0 ? BigInteger.valueOf(a) : BigInteger.valueOf(a + 1));
		}

		System.out.println(count.multiply(BigInteger.valueOf(cluster)));
	}

	public static void main(String[] args) {
		new P01350___RealSpace().solve();
	}

	static class Scanner {
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
