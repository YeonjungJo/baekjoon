package baekjoon.solve;
import java.util.Scanner;

public class P11047___Coin {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			count += k / coin[i];
			k -= coin[i] * (k / coin[i]);
			if (k == 0) {
				System.out.println(count);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P11047___Coin().solve();
	}
}
