package baekjoon.solve;
import java.util.Scanner;

public class P07482___MakeBox {

	private static final Scanner sc = new Scanner(System.in);

	/**
	 * f(h) = 4h^3 - 4ah^2 + a^2h; 
	 * f'(h) = 12h^2 - 8ah + a^2; 
	 * so, h = a/2 or a/6;
	 */

	/*
	 * h must be 0 < h < a/2. 
	 * thus, h = a/6;
	 */

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			double a = sc.nextDouble() / 6;
			System.out.printf("%.10f\n", a);
		}
	}

	public static void main(String[] args) {
		new P07482___MakeBox().solve();
	}
}
