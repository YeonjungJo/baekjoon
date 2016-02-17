package baekjoon.solve;

import java.util.Scanner;

public class P11659___SumOfSection {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] data = new int[n];
		int[] sum = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
			if (i > 0) sum[i] = sum[i - 1] + data[i];
			else sum[i] = data[i];
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (a == 0) System.out.println(sum[b]);
			else System.out.println(sum[b] - sum[a - 1]);
		}
	}

	public static void main(String[] args) {
		new P11659___SumOfSection().solve();
	}
}
