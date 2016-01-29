package baekjoon.todo;
import java.util.Scanner;

public class T6439___Intersect {

	private int testcase;

	private void solve() {
		Scanner sc = new Scanner(System.in);
		testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			Line l = new Line(new Point(sc.nextInt(), sc.nextInt()), new Point(sc.nextInt(), sc.nextInt()));
			Rectangle r = new Rectangle(new Point(sc.nextInt(), sc.nextInt()), new Point(sc.nextInt(), sc.nextInt()));

			double a = l.getAngle();
			if (a == Double.NaN) {
				if (l.getXvalue(0) >= r.pLeftTop.x && l.getXvalue(0) <= r.pRightBottom.x) {
					System.out.println("T");
					return;
				} else {
					System.out.println("F");
					return;
				}
			} else {
				if (r.isTangent(a, l.getYintercept())) System.out.println("T");
				else System.out.println("F");
			}
		}
	}

	private class Line {
		Point pStart;
		Point pEnd;

		public Line(Point pStart, Point pEnd) {
			this.pStart = pStart;
			this.pEnd = pEnd;
		}

		public double getAngle() {
			if (pStart.x - pEnd.x == 0) return Double.NaN;
			return (pStart.y - pEnd.y) / (double) (pStart.x - pEnd.x);
		}

		public double getYintercept() {
			double a = getAngle();
			if (a == Double.NaN) return Double.NaN;
			return pStart.y - a * pStart.x;
		}

		public double getXvalue(double y) {
			double a = getAngle();
			if (a == Double.NaN) return pStart.x;
			return (y - getYintercept()) / a;
		}
	}

	private class Rectangle {
		Point pLeftTop;
		Point pRightBottom;

		public Rectangle(Point pStart, Point pEnd) {
			this.pLeftTop = pStart;
			this.pRightBottom = pEnd;
		}

		public boolean isTangent(double a, double b) {
			if (b <= pLeftTop.y - a * pLeftTop.x && b >= pRightBottom.y - a * pRightBottom.x) return true;
			if (b >= pLeftTop.y - a * pLeftTop.x && b <= pRightBottom.y - a * pRightBottom.x) return true;
			return false;
		}
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
		new T6439___Intersect().solve();
	}
}
