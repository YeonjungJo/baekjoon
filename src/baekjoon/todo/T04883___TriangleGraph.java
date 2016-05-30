package baekjoon.todo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T04883___TriangleGraph {

	private static final int MAX_VALUE = 100000001;
	private static final int NOT_AVAILABLE = 100000001;

	private static final int[][] DIRECTION = { { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

	private void solve() {
		for (int testcase = 1;; testcase++) {
			int n = sc.nextInt();
			if (n == 0) return;

			int[][] graph = new int[n][3];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 3; j++) {
					graph[i][j] = sc.nextInt();
				}
			}

			int[][] d = new int[n][3];
			System.out.println(testcase + ". " + search(d, graph, n - 1, 1, 0, 0));

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.printf("%8d ", d[i][j]);
				}
				System.out.println();
			}
		}
	}

	private int search(int[][] d, int[][] graph, int h, int w, int i, int j) {
		if (i < 0 || j < 0 || i >= h || j >= w) return NOT_AVAILABLE;
		if (i == h - 1 && j == 1) return d[i][j] = graph[i][j];
		if (d[i][j] != 0) return d[i][j];

		int min = MAX_VALUE;
		for (int dir = 0; dir < DIRECTION.length; dir++) {
			int tmp = search(d, graph, h, w, i + DIRECTION[dir][0], j + DIRECTION[dir][1]);
			if (tmp < min) min = tmp;
		}
		return d[i][j] = min + graph[i][j];
	}

	public static void main(String[] args) {
		sc.init();
		new T04883___TriangleGraph().solve();
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
