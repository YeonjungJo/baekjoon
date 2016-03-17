package baekjoon.todo;
import java.util.Scanner;

public class T05025___Doodle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			Cell[][] c = new Cell[h][w];
			System.out.println(search(c, h, w));
		}
	}

	private int search(Cell[][] c, int h, int w) {
		int count = 0;
		int x = 0;
		int y = 0;
		boolean r = true;
		boolean d = true;

		while (true) {
			if (c[y][x] == null) {
				c[y][x] = new Cell(r, d);
				count++;
			} else {
				if (c[y][x].isDown() ^ d && c[y][x].isRight() ^ r) {
					System.out.println(y + " , " + x);
					return count;
				}
			}

			if (x == w - 1 && r) r = false;
			if (x == 0 && !r) r = true;
			if (y == h - 1 && d) d = false;
			if (y == 0 && !d) d = true;

			x = r ? x + 1 : x - 1;
			y = d ? y + 1 : y - 1;

			if (x == 0 && y == 0) return count;
		}
	}

	private class Cell {
		private boolean r;
		private boolean d;

		public Cell(boolean r, boolean d) {
			this.r = r;
			this.d = d;
		}

		public boolean isRight() {
			return r;
		}

		public boolean isDown() {
			return d;
		}
	}

	public static void main(String[] args) {
		new T05025___Doodle().solve();
	}
}
