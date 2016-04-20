package baekjoon.todo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T04029___Condorcet {

	private void solve() {
		StringBuilder result = new StringBuilder();
		for (int testcase = 1;; testcase++) {
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (b == 0 && c == 0) {
				System.out.println(result.toString());
				return;
			}

			int[][] vote = new int[b][c];
			for (int i = 0; i < b; i++) {
				for (int j = 0; j < c; j++) {
					vote[i][j] = sc.nextInt();
				}
			}

			boolean[] d = new boolean[c];
			int winner = find(d, vote, c);
			if (winner == -1) result.append(String.format("Case %d: No Condorcet winner\n", testcase));
			else result.append(String.format("Case %d: %d\n", testcase, winner));
		}
	}

	private int find(boolean[] d, int[][] vote, int c) {
		for (int i = 0; i < c; i++) {
			if (!d[i]) {
				int winner = getWinner(d, vote, c, i);
				if (winner != -1) return winner;
			}
		}
		return -1;
	}

	private int getWinner(boolean[] d, int[][] vote, int c, int candidate) {
		d[candidate] = true;
		for (int i = 0; i < c; i++) {
			if (i != candidate) {
				int result = compare(vote, candidate, i);
				if (result == -1) {
					if (d[i]) return -1;
					return getWinner(d, vote, c, i);
				} else if (result == 0) {
					d[i] = true;
					return -1;
				}
			}
		}
		return candidate;
	}

	private int compare(int[][] vote, int candidate, int competitor) {
		int majority = vote.length / 2;
		int win = 0;
		int lose = 0;
		for (int i = 0; i < vote.length; i++) {
			if (isWin(vote, candidate, competitor, i)) {
				win++;
				if (win > majority) return 1;
			} else {
				lose++;
				if (lose > majority) return -1;
			}
		}
		return 0;
	}

	private boolean isWin(int[][] vote, int candidate, int competitor, int i) {
		for (int j = 0; j < vote[i].length; j++) {
			if (vote[i][j] == candidate) return true;
			if (vote[i][j] == competitor) return false;
		}
		return false;
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
