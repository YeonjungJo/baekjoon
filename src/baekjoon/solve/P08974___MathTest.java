package baekjoon.solve;
import java.util.Scanner;

public class P08974___MathTest {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt() - 1;
		int m = sc.nextInt();

		System.out.println(sum(m) - sum(n));
	}

	private long sum(int n) {
		double k = getK(n);
		int i = (int) k;
		if (k == i) return i * (i + 1) * (2 * i + 1) / 6;
		return i * (i + 1) * (2 * i + 1) / 6 + (i + 1) * (n - (i * (i + 1)) / 2);
	}

	private double getK(int n) {
		return (-1 + Math.sqrt(1 + 8 * n)) / 2;
	}

	public static void main(String[] args) {
		new P08974___MathTest().solve();
	}
}
