package baekjoon.solve;
import java.util.Scanner;

public class P11312___TrianglePattern {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();

		for (int t = 0; t < testcase; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			long n = a / b;
			System.out.println(n * n);
		}
	}

	public static void main(String[] args) {
		new P11312___TrianglePattern().solve();
	}
}
