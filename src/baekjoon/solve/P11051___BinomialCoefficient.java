package baekjoon.solve;
import java.util.Scanner;

public class P11051___BinomialCoefficient {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[][] d = new int[n + 1][n + 1];

		System.out.println(search(d, n, k));
	}

	private int search(int[][] d, int n, int k) {
		if (k == 0 || k == n) return 1;
		if (d[n][k] != 0) return d[n][k];
		return d[n][k] = (search(d, n - 1, k - 1) + search(d, n - 1, k)) % 10007;
	}

	public static void main(String[] args) {
		new P11051___BinomialCoefficient().solve();
	}
}
