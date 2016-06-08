package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01744___BindNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int[] d = new int[n];
		search(d, a, n, 0, 0);
		System.out.println(d[0]);
	}

	private int search(int[] d, int[] a, int n, int k, int sum) {
		if (k >= n) return 0;
		if (k == n - 1) return d[k] = a[k];
		if (d[k] != 0 && d[k] > sum) return d[k];
		return d[k] = max(a[k] + search(d, a, n, k + 1, sum + a[k]), a[k] * a[k + 1] + search(d, a, n, k + 2, sum + a[k] * a[k + 1]));
	}

	private int max(int i, int j) {
		return i > j ? i : j;
	}

	public static void main(String[] args) {
		new P01744___BindNumber().solve();
	}
}
