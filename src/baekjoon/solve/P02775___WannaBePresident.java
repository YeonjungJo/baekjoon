package baekjoon.solve;
import java.util.Scanner;

public class P02775___WannaBePresident {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] d = new int[k + 1][n + 1];
			System.out.println(search(d, k, n));
		}
	}

	private int search(int[][] d, int k, int n) {
		if (k == 0) return n;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += search(d, k - 1, i);
		}
		return d[k][n] = sum;
	}

	public static void main(String[] args) {
		new P02775___WannaBePresident().solve();
	}
}
