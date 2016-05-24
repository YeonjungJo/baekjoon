package baekjoon.solve;
import java.util.Scanner;

public class P01965___PutIntoBox {

	private static final Scanner sc = new Scanner(System.in);

	private static final int INITIAL_VALUE = 0;

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			search(d, a, n, i, INITIAL_VALUE);
		}

		int max = INITIAL_VALUE;
		for (int i = 0; i < n; i++) {
			if (d[i] > max) max = d[i];
		}
		System.out.println(max);
	}

	private int search(int[] d, int[] a, int n, int current, int count) {
		if (d[current] != INITIAL_VALUE) return d[current];
		int max = 0;
		for (int next = current + 1; next < n; next++) {
			if (a[next] > a[current]) {
				int tmp = search(d, a, n, next, count + 1);
				if (tmp > max) max = tmp;
			}
		}
		return d[current] = max + 1;
	}

	public static void main(String[] args) {
		new P01965___PutIntoBox().solve();
	}
}
