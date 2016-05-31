import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T04029___Condorcet {

	private static final String NO_WINNER = "No Condorcet winner";

	private void solve() {
		int testcase = 1;
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) return;

			search(testcase, n, m);
		}
	}

	private void search(int testcase, int n, int m) {
		Candidate[] candidate = new Candidate[m];
		for (int i = 0; i < m; i++) {
			candidate[i] = new Candidate(i, m);
		}

		for (int i = 0; i < n; i++) {
			boolean[] b = new boolean[m];
			for (int j = 0; j < m; j++) {
				int tmp = sc.nextInt();
				b[tmp] = true;
				candidate[tmp].update(b);
			}
		}

		boolean[] isLose = new boolean[m];
		for (int i = 0; i < m; i++) {
			if (!isLose[i] && check(isLose, candidate, m, i)) {
				System.out.printf("Case %d: %d\n", testcase++, i);
				return;
			}
			isLose[i] = true;
		}

		System.out.printf("Case %d: %s\n", testcase++, NO_WINNER);
	}

	private boolean check(boolean[] isLose, Candidate[] candidate, int m, int i) {
		for (int j = 0; j < m; j++) {
			if (!candidate[i].compare(candidate[j])) return false;
			isLose[j] = true;
		}
		return true;
	}

	private class Candidate {
		private final int id;
		private int[] win;

		public Candidate(int id, int n) {
			this.id = id;
			win = new int[n];
		}

		public boolean compare(Candidate candidate) {
			if (candidate.getId() == this.id) return true;
			if (this.getWinningRate(candidate.getId()) > candidate.getWinningRate(this.id)) return true;
			return false;
		}

		public void update(boolean[] b) {
			for (int i = 0; i < b.length; i++) {
				if (!b[i]) win[i]++;
			}
		}

		public int getId() {
			return id;
		}

		public int getWinningRate(int id) {
			return win[id];
		}
	}

	public static void main(String[] args) {
		sc.init();
		new T04029___Condorcet().solve();
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