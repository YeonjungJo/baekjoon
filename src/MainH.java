import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MainH {

	private static final int CONSTANT = 1000000007;

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] material = new int[m];
		for (int i = 0; i < m; i++) {
			material[i] = sc.nextInt();
		}

		long result = 0;
		int[] sum = new int[m];
		Arrays.fill(sum, 1);
		for (int i = n; i >= 0; i--) {
			result += getSum(i, n, m, material, sum);
			result %= CONSTANT;
		}

		System.out.println(result);
	}

	private long getSum(int k, int n, int m, int[] material, int[] sum) {
		long result = (long) (Math.pow(material[0], k) % CONSTANT);

		if (m == 1 || k == n) {
			if (k == 0) return 0;
			else return result;
		}

		sum[m - 1] *= material[m - 1];
		for (int i = m - 2; i > 0; i--) {
			sum[i] = (sum[i + 1] + (sum[i] * material[i])) % CONSTANT;
		}
		return sum[1] * result;
	}

	public static void main(String[] args) {
		sc.init();
		new MainH().solve();
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
