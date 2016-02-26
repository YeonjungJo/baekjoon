package baekjoon.solve.dp;
import java.util.Scanner;

public class P02294___Coin {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] d = new int[k + 1];
		int[] c = new int[n];

		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			if (c[i] <= k) d[c[i]] = 1;
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= k; j++) {
				if (d[j] != 0 && j + c[i] <= k) {
					if (d[j + c[i]] == 0 || d[j + c[i]] > d[j] + 1) d[j + c[i]] = d[j] + 1;
				}
			}
		}

		System.out.println(d[k] == 0 ? -1 : d[k]);
	}

	public static void main(String[] args) {
		new P02294___Coin().solve();
	}
}
