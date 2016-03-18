package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P07795___EatingOrEaten {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int[] b = new int[m];
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}

			Arrays.sort(a);
			Arrays.sort(b);

			int i = 0;
			int j = 0;
			int count = 0;
			while (i < n && j < m) {
				if (a[i] <= b[j]) {
					i++;
				} else {
					count += n - i;
					j++;
				}
			}

			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		new P07795___EatingOrEaten().solve();
	}
}
