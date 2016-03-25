package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P07576___Tomato {

	private static final Scanner sc = new Scanner(System.in);

	private static final int RIPE = 1;
	private static final int UNRIPE = 0;
	private static final int EMPTY = -1;
	private static final int READY = 2;

	private void solve() {
		int m = sc.nextInt();
		int n = sc.nextInt();

		LinkedList<Pos> stack = new LinkedList<>();
		int[][] t = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				t[i][j] = sc.nextInt();
				if (t[i][j] == RIPE) {
					stack.add(new Pos(i, j, 1));
					t[i][j] = READY;
				}
			}
		}

		int[][] v = new int[n][m];
		while (!stack.isEmpty()) {
			Pos p = stack.pop();
			t[p.i][p.j] = RIPE;
			// System.out.printf("POP: %d, %d ( day : %d )\n", p.i, p.j, p.day);
			ripe(v, t, stack, n, m, p.i, p.j, p.day);

			// for (int i = 0; i < n; i++) {
			// for (int j = 0; j < m; j++) {
			// System.out.printf("%2d ", v[i][j]);
			// }
			// System.out.println();
			// }
			// System.out.println();
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (v[i][j] == UNRIPE && t[i][j] == UNRIPE) {
					System.out.println(-1);
					return;
				}
				max = v[i][j] > max ? v[i][j] : max;
			}
		}
		System.out.println(max - 1);
	}

	private void ripe(int[][] v, int[][] t, LinkedList<Pos> stack, int n, int m, int i, int j, int day) {
		if (i < 0 || j < 0 || i >= n || j >= m) return;
		if (t[i][j] == UNRIPE) {
			t[i][j] = READY;
			// System.out.printf("stack.add(%d, %d, %d)\n", i, j, day);
			stack.add(new Pos(i, j, day));
		} else if (t[i][j] == RIPE) {
			t[i][j] = EMPTY;
			v[i][j] = day;
			ripe(v, t, stack, n, m, i - 1, j, day + 1);
			ripe(v, t, stack, n, m, i + 1, j, day + 1);
			ripe(v, t, stack, n, m, i, j - 1, day + 1);
			ripe(v, t, stack, n, m, i, j + 1, day + 1);
		}
	}

	private class Pos {
		int i;
		int j;
		int day;

		public Pos(int i, int j, int day) {
			this.i = i;
			this.j = j;
			this.day = day;
		}
	}

	public static void main(String[] args) {
		new P07576___Tomato().solve();
	}
}
