package baekjoon.todo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T11048___Move {

	private static final int NOT_AVAILABLE = 0;

	private static final int[][] DIR = { { 1, 0 }, { 0, 1 } };

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] maze = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				maze[i][j] = sc.nextInt();
			}
		}

		int[][] d = new int[n][m];
		System.out.println(search(d, maze, n, m, 0, 0));
	}

	private int search(int[][] d, int[][] maze, int n, int m, int i, int j) {
		if (i >= n || j >= m) return NOT_AVAILABLE;
		if (d[i][j] != 0) return d[i][j];
		if (i == n - 1 && j == m - 1) return d[i][j] = maze[i][j];

		int max = 0;
		for (int dir = 0; dir < DIR.length; dir++) {
			int tmp = search(d, maze, n, m, i + DIR[dir][0], j + DIR[dir][1]);
			if (tmp > max) max = tmp;
		}
		return d[i][j] = maze[i][j] + max;
	}

	public static void main(String[] args) {
		sc.init();
		new T11048___Move().solve();
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
