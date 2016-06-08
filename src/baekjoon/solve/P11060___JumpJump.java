package baekjoon.solve;
import java.util.Scanner;

public class P11060___JumpJump {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NOT_AVAILABLE = -1;
	private static final int MAX_VALUE = 1001;
	private static final int ARRIVE = 0;

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] d = new int[n];
		search(d, a, n, 0);

		if (d[0] == MAX_VALUE) System.out.println(NOT_AVAILABLE);
		else System.out.println(d[0]);
	}

	private int search(int[] d, int[] a, int n, int p) {
		if (p >= n) return MAX_VALUE;
		if (p == n - 1) return d[p] = ARRIVE;
		if (a[p] == 0) return d[p] = MAX_VALUE;
		if (d[p] != 0) return d[p];

		int min = MAX_VALUE;
		for (int i = a[p]; i > 0; i--) {
			int tmp = search(d, a, n, p + i);
			if (tmp < min) min = tmp;
		}

		if (min == MAX_VALUE) return d[p] = MAX_VALUE;
		return d[p] = 1 + min;
	}

	public static void main(String[] args) {
		new P11060___JumpJump().solve();
	}
}
