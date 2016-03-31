package baekjoon.todo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T03020___Firefly {

	private void solve() {
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[h];

		for (int i = 0; i < n; i++) {
			int size = sc.nextInt();
			if (i % 2 == 0) {
				for (int j = 0; j < size; j++) {
					a[j]++;
				}
			} else {
				for (int j = h - 1; j >= h - size; j--) {
					a[j]++;
				}
			}
		}

		Arrays.sort(a);
		int min = a[0];
		int cnt = 0;
		for (int i = 0; i < h; i++) {
			if (min < a[i]) break;
			cnt++;
		}

		System.out.println(min + " " + cnt);
	}

	public static void main(String[] args) {
		sc.init();
		new T03020___Firefly().solve();
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
