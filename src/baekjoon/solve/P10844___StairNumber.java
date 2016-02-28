package baekjoon.solve;
import java.util.Scanner;

public class P10844___StairNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[][] d = new int[n + 1][10];

		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum = (sum + count(d, n, i)) % 1000000000;
		}

		System.out.println(sum);
	}

	private int count(int[][] d, int n, int i) {
		if (i < 0 || i > 9) return 0;
		if (n == 1) return 1;
		if (d[n][i] != 0) return d[n][i];
		return d[n][i] = (count(d, n - 1, i - 1) + count(d, n - 1, i + 1)) % 1000000000;
	}

	public static void main(String[] args) {
		new P10844___StairNumber().solve();
	}
}
