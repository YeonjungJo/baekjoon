package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01812___Candy {

	private void solve() {
		int n = sc.nextInt();
		int sum = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		for (int i = 0; i <= sum / 2 && i <= a[0]; i++) {
			int[] d = new int[n];
			d[0] = i;
			search(d, a, n);
		}
	}

	private void search(int[] d, int[] a, int n) {
		for (int j = 1; j < n; j++) {
			d[j] = a[j - 1] - d[j - 1];
			// System.out.printf("d[%d] : %d = %d - %d\n", j, d[j], a[j - 1],
			// d[j - 1]);
			if (d[j] < 0) return;
		}
		if (d[n - 1] + d[0] == a[n - 1]) print(d);
	}

	private void print(int[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P01812___Candy().solve();
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
