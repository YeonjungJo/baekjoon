package baekjoon.solve;
import java.util.Scanner;

public class P01697___HideAndSeek {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (k <= n) {
			System.out.println(n - k);
			return;
		}

		int[] d = new int[k * 2 + 1];
		for (int i = n; i >= n / 2; i--) {
			d[i] = n - i + 1;
		}

		for (int i = n / 2; i <= k; i++) {
			if (d[i + 1] == 0 || d[i + 1] > d[i] + 1) d[i + 1] = d[i] + 1;
			if (d[i * 2] == 0 || d[i * 2] > d[i] + 1) d[i * 2] = d[i] + 1;

			// System.out.println();
			// System.out.println("current position : " + i);
			// for (int j = 0; j < d.length; j++) {
			// System.out.printf("%3d", j);
			// }
			// System.out.println();
			// for (int j = 0; j < d.length; j++) {
			// System.out.printf("%3d", d[j]);
			// }

			if (i != n / 2 && i != n && d[i - 1] > d[i] + 1) {
				d[i - 1] = d[i] + 1;
				i -= 2;
			}
		}

		for (int i = k + 1; i <= 2 * k; i++) {
			if (d[i] != 0 && d[k] > d[i] + (i - k)) d[k] = d[i] + i - k;

			// System.out.println();
			// System.out.println("current position : " + i);
			// for (int j = 0; j < d.length; j++) {
			// System.out.printf("%3d", j);
			// }
			// System.out.println();
			// for (int j = 0; j < d.length; j++) {
			// System.out.printf("%3d", d[j]);
			// }
		}

		// for (int i = 0; i < d.length; i++) {
		// System.out.printf("%3d", i);
		// }
		// System.out.println();
		// for (int i = 0; i < d.length; i++) {
		// System.out.printf("%3d", d[i]);
		// }

		System.out.println(d[k] - 1);
	}

	public static void main(String[] args) {
		new P01697___HideAndSeek().solve();
	}
}
