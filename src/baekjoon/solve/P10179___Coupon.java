package baekjoon.solve;
import java.util.Scanner;

public class P10179___Coupon {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("$%.02f\n", Math.round(sc.nextDouble() * 0.8 * 100) / 100.0);
		}
	}

	public static void main(String[] args) {
		new P10179___Coupon().solve();
	}
}
