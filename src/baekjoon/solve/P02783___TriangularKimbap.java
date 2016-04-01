package baekjoon.solve;
import java.util.Scanner;

public class P02783___TriangularKimbap {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		double a = x / (float) y;

		int n = sc.nextInt();
		double[] d = new double[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextDouble() / sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			if (a > d[i]) a = d[i];
		}

		System.out.printf("%.2f", a * 1000);
	}

	public static void main(String[] args) {
		new P02783___TriangularKimbap().solve();
	}
}
