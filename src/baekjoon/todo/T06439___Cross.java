package baekjoon.todo;
import java.util.Scanner;

public class T06439___Cross {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			Line l = new Line(new Point(sc.nextInt(), sc.nextInt()), new Point(sc.nextInt(), sc.nextInt()));

			int xleft = sc.nextInt();
			int ytop = sc.nextInt();
			int xright = sc.nextInt();
			int ybottom = sc.nextInt();

			Line[] sq = new Line[4];

			Point a = new Point(xleft, ytop);
			Point b = new Point(xleft, ybottom);
			Point c = new Point(xright, ytop);
			Point d = new Point(xright, ybottom);

			sq[0] = new Line(a, b);
			sq[1] = new Line(a, c);
			sq[2] = new Line(d, b);
			sq[3] = new Line(d, c);

			System.out.println(search(l, sq) ? "T" : "F");
		}
	}

	private boolean search(Line l, Line[] sq) {
		for (int i = 0; i < 4; i++) {
			if (l.isCross(sq[i])) return true;
		}
		return false;
	}

	public class Line {
		Point start;
		Point end;
		Double a;
		Double b;
		Double c;

		public Line(Point start, Point end) {
			this.start = start;
			this.end = end;

			a = getAngle();
			b = getYIntersection();
			c = getXIntersection();

			System.out.printf("%d, %d, %d, %d : %f, %f, %f\n", start.x, start.y, end.x, end.y, a, b, c);
		}

		private Double getAngle() {
			double dx = start.x - end.x;
			double dy = start.y - end.y;
			if (dx == 0) return Double.NaN;
			return dy / dx;
		}

		private Double getYIntersection() {
			return start.y - a * start.x;
		}

		private Double getXIntersection() {
			if (a.isNaN()) return (double) start.x;
			return -b / a;
		}

		public boolean isCross(Line line) {
			if (a.equals(0)) {
				if (line.a.equals(0)) return b.equals(line.b);
				if (line.a.isNaN()) return line.containY(b);
			}
			if (a.isNaN()) {
				if (line.a.equals(0)) return containY(line.b);
				if (line.a.isNaN()) return c.equals(line.c);
			}

			if (line.a.isNaN()) {
				double y = a * line.c + b;
				System.out.println("y: " + y);
				if (line.containY(y)) return true;
				return false;
			} else {
				double x = (line.b - b) / a;
				System.out.println("x: " + x);
				if (line.containX(x)) return true;
				return false;
			}
		}

		private boolean containY(double y) {
			int min = start.y > end.y ? end.y : start.y;
			int max = start.y < end.y ? end.y : start.y;
			if (y >= min && y <= max) return true;
			return false;
		}

		private boolean containX(double x) {
			int min = start.x > end.x ? end.x : start.x;
			int max = start.x < end.x ? end.x : start.x;
			if (x >= min && x <= max) return true;
			return false;
		}
	}

	public class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		new T06439___Cross().solve();
	}
}
