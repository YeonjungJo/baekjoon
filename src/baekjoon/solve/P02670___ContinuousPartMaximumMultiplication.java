package baekjoon.solve;
import java.util.Scanner;

public class P02670___ContinuousPartMaximumMultiplication {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		double max = 0;
		double tmp = 1;
		double[] d = new double[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextDouble();
			tmp *= d[i];
			if (max < tmp) max = tmp;
			if (tmp < 1) tmp = 1;
		}
		System.out.printf("%.3f", Math.round(max * 1000) / 1000.0);
	}

	public static void main(String[] args) {
		new P02670___ContinuousPartMaximumMultiplication().solve();
	}
}
