package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01485___Square {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			Point[] p = new Point[4];
			for (int i = 0; i < 4; i++) {
				p[i] = new Point(sc.nextInt(), sc.nextInt());
			}

			double[] l = new double[3];
			for (int i = 1; i <= 3; i++) {
				l[i - 1] = getLenth(p[0], p[i]);
			}

			Arrays.sort(l);
			if (l[0] == l[1] && 2 * l[0] == l[2]) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

	private double getLenth(Point a, Point b) {
		return Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2);
	}

	private class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		new P01485___Square().solve();
	}
}
