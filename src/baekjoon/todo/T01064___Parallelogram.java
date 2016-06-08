package baekjoon.todo;
import java.util.Arrays;
import java.util.Scanner;

public class T01064___Parallelogram {

	private static final Scanner sc = new Scanner(System.in);

	private static final int IMPOSSIBLE = -1;

	private void solve() {
		int[] a = { sc.nextInt(), sc.nextInt() };
		int[] b = { sc.nextInt(), sc.nextInt() };
		int[] c = { sc.nextInt(), sc.nextInt() };

		double[] perimeter = new double[3];
		perimeter[0] = getPerimeter(a, b, c);
		perimeter[1] = getPerimeter(b, c, a);
		perimeter[2] = getPerimeter(c, a, b);
		Arrays.sort(perimeter);

		if (perimeter[0] == IMPOSSIBLE) System.out.println(IMPOSSIBLE);
		else System.out.printf("%.10f", perimeter[2] - perimeter[0]);
	}

	private double getPerimeter(int[] c, int[] a, int[] b) {
		double[] va = { a[0] - c[0], a[1] - c[1] };
		double[] vb = { b[0] - c[0], b[1] - c[1] };

		double ma = getMagnitude(va[0], va[1]);
		double mb = getMagnitude(vb[0], vb[1]);

		System.out.println(ma + " , " + mb);

		double innerProduct = va[0] * vb[0] + va[1] * vb[1];

		if (ma * mb == Math.abs(innerProduct)) return IMPOSSIBLE;
		return 2 * (ma + mb);
	}

	private double getMagnitude(double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public static void main(String[] args) {
		new T01064___Parallelogram().solve();
	}
}
