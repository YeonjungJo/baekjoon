package baekjoon.solve;
import java.util.Scanner;

public class P11441___GetSum {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			if (i > 0) a[i] = a[i - 1] + sc.nextInt();
			else a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt() - 1;
			int q = sc.nextInt() - 1;
			if (p == 0) System.out.println(a[q]);
			else System.out.println(a[q] - a[p - 1]);
		}
	}

	public static void main(String[] args) {
		new P11441___GetSum().solve();
	}
}
