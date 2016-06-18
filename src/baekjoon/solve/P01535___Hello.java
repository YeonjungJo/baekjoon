package baekjoon.solve;
import java.util.Scanner;

public class P01535___Hello {

	private static final Scanner sc = new Scanner(System.in);

	private static final int DIE = 0;

	private void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();

		System.out.println(search(n, a, b, 0, 100, 0));
	}

	private int search(int n, int[] a, int[] b, int k, int hp, int pl) {
		if (hp <= 0) return DIE;
		if (k == n - 1) {
			if (hp - a[k] <= 0) return pl;
			else return pl + b[k];
		}
		return max(search(n, a, b, k + 1, hp - a[k], pl + b[k]), search(n, a, b, k + 1, hp, pl));
	}

	private int max(int i, int j) {
		return i > j ? i : j;
	}

	public static void main(String[] args) {
		new P01535___Hello().solve();
	}
}
