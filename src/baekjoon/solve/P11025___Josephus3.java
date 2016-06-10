package baekjoon.solve;
import java.util.Scanner;

public class P11025___Josephus3 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(josephus(n, m) + 1);
	}

	private int josephus(int n, int k) {
		int r = 0;
		for (int i = 1; i <= n; i++) {
			r = (r + k) % i;
		}
		return r;
	}

	public static void main(String[] args) {
		new P11025___Josephus3().solve();
	}
}
