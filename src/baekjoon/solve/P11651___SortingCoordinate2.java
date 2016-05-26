package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P11651___SortingCoordinate2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		Point[] p = new Point[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Point(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(p);
		for (int i = 0; i < n; i++) {
			System.out.println(p[i].toString());
		}
	}

	private class Point implements Comparable<Point> {
		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		@Override
		public String toString() {
			return String.format("%d %d", getX(), getY());
		}

		@Override
		public int compareTo(Point o) {
			if (this.x == o.getX() && this.y == o.getY()) return 0;
			if (this.y < o.getY() || (this.y == o.getY() && this.x < o.getX())) return -1;
			return 1;
		}
	}

	public static void main(String[] args) {
		new P11651___SortingCoordinate2().solve();
	}
}
