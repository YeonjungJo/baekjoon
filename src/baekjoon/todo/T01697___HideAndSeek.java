package baekjoon.todo;
import java.util.Scanner;

public class T01697___HideAndSeek {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] d = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			d[i] = i > n ? i - n : n - i;
		}

		if (k <= n) {
			System.out.println(n - k);
			return;
		}

		boolean tmp = true;
		while (true) {
			tmp = false;
			for (int i = 0; i <= k; i++) {
				if (i != 0 && d[i] > d[i - 1] + 1) {
					d[i] = d[i - 1] + 1;
					tmp = true;
				}
				if (i != k && d[i] > d[i + 1] + 1) {
					d[i] = d[i + 1] + 1;
					tmp = true;
				}
				if (i <= k / 2 && (d[i] + 1 < d[i * 2])) {
					d[i * 2] = d[i] + 1;
					tmp = true;
				}
			}
			if (!tmp) break;
		}

		System.out.println(d[k]);
	}

	public static void main(String[] args) {
		new T01697___HideAndSeek().solve();
	}
}