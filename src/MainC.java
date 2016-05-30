import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainC {

	private static final int MAX = 2000000001;
	private static final int IMPOSSIBLE = -1;
	private static final int SUCCESS = 1;
	private static final int CONTINUE = 0;

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
		}

		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = i;
		}

		for (int i = 1; i < MAX; i++) {
			int play = play(a, d, n);

			// for (int j = 0; j < n; j++) {
			// System.out.print(d[j] + " ");
			// }
			// System.out.println();

			if (play == IMPOSSIBLE) {
				System.out.println(IMPOSSIBLE);
				return;
			}
			if (play == SUCCESS && i >= 2) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(IMPOSSIBLE);
	}

	private int play(int[] a, int[] d, int n) {
		int result = SUCCESS;
		boolean[] v = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (d[i] == a[d[i]] && a[d[i]] == i) return IMPOSSIBLE;
			d[i] = a[d[i]];
			if (d[i] == i) result = CONTINUE;

			if (v[d[i]]) return IMPOSSIBLE;
			v[d[i]] = true;
		}
		return result;
	}

	public static void main(String[] args) {
		sc.init();
		new MainC().solve();
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
