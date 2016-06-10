package baekjoon.solve;
import java.util.Scanner;

public class P06600___Circumference {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNext()) {
			double ax = sc.nextDouble();
			double ay = sc.nextDouble();
			double bx = sc.nextDouble();
			double by = sc.nextDouble();
			double cx = sc.nextDouble();
			double cy = sc.nextDouble();

			double a = getEdge(bx, by, cx, cy);
			double b = getEdge(ax, ay, cx, cy);
			double c = getEdge(ax, ay, bx, by);

			double s = (a + b + c) / 2;

			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

			System.out.printf("%.2f\n", Math.PI * a * b * c / (2 * area));
		}
	}

	private double getEdge(double ax, double ay, double bx, double by) {
		return Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
	}

	public static void main(String[] args) {
		new P06600___Circumference().solve();
	}
}
