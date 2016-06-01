package baekjoon.solve;
import java.util.Scanner;

public class P05612___EntranceAndExitToTunnel {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int max = m;
		for (int i = 0; i < n; i++) {
			m += sc.nextInt() - sc.nextInt();
			if (m < 0) {
				System.out.println(0);
				return;
			}
			if (m > max) max = m;
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		new P05612___EntranceAndExitToTunnel().solve();
	}
}
