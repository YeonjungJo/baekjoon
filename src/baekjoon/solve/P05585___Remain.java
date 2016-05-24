package baekjoon.solve;
import java.util.Scanner;

public class P05585___Remain {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] COIN = { 500, 100, 50, 10, 5, 1 };

	private void solve() {
		int n = 1000 - sc.nextInt();
		int r = 0;
		for (int i = 0; i < COIN.length; i++) {
			int tmp = n / COIN[i];
			r += tmp;
			n -= COIN[i] * tmp;
		}
		System.out.println(r);
	}

	public static void main(String[] args) {
		new P05585___Remain().solve();
	}
}
