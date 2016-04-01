package baekjoon.solve;
import java.util.Scanner;

public class P02851___SuperMario {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {

		int[] a = new int[11];
		a[0] = -100;
		for (int i = 1; i < 11; i++) {
			a[i] = sc.nextInt() + a[i - 1];
		}

		int result = a[0];
		for (int i = 1; i < 11; i++) {
			result = min(result, a[i]);
		}

		System.out.println(result + 100);
	}

	private int min(int min, int i) {
		if (Math.abs(min) > Math.abs(i)) return i;
		if (Math.abs(min) < Math.abs(i)) return min;
		return min > i ? min : i;
	}

	public static void main(String[] args) {
		new P02851___SuperMario().solve();
	}
}