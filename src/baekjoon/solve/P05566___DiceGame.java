package baekjoon.solve;
import java.util.Scanner;

public class P05566___DiceGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		int p = 1;
		for (int i = 1; i <= m; i++) {
			p += sc.nextInt();
			if (p >= n) {
				System.out.println(i);
				return;
			}
			p += a[p];
			if (p >= n) {
				System.out.println(i);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P05566___DiceGame().solve();
	}
}
