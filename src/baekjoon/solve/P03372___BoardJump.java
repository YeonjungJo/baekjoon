package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P03372___BoardJump {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		BigInteger[][] d = new BigInteger[n][n];
		System.out.println(search(d, a, n, 0, 0));
	}

	private BigInteger search(BigInteger[][] d, int[][] a, int n, int i, int j) {
		if (i < 0 || j < 0 || i >= n || j >= n) return BigInteger.ZERO;
		if (i == n - 1 && j == n - 1) return BigInteger.ONE;
		if (a[i][j] == 0) return BigInteger.ZERO;
		if (d[i][j] != null) return d[i][j];
		return d[i][j] = search(d, a, n, i + a[i][j], j).add(search(d, a, n, i, j + a[i][j]));
	}

	public static void main(String[] args) {
		new P03372___BoardJump().solve();
	}
}
