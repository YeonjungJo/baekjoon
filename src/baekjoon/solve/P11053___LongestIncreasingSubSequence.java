package baekjoon.solve;
import java.util.Scanner;

public class P11053___LongestIncreasingSubSequence {

	private static final Scanner sc = new Scanner(System.in);

	private static final int OUT_OF_RANGE = 0;

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] d = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (d[i] == 0) {
				search(d, a, n, i);
				if (max < d[i]) max = d[i];
			}
		}
		System.out.println(max);
	}

	private int search(int[] d, int[] a, int n, int i) {
		if (i < 0 || i >= n) return OUT_OF_RANGE;
		if (d[i] != 0) return d[i];

		int max = 0;
		for (int k = i + 1; k < n; k++) {
			if (a[k] > a[i]) {
				int tmp = search(d, a, n, k);
				if (tmp > max) max = tmp;
			}
		}
		return d[i] = max + 1;
	}

	public static void main(String[] args) {
		new P11053___LongestIncreasingSubSequence().solve();
	}
}
