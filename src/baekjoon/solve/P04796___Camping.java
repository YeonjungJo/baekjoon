package baekjoon.solve;
import java.util.Scanner;

public class P04796___Camping {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int t = 1;
		while (true) {
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			if (l == 0 && p == 0 && v == 0) return;

			int sum = (v / p) * l;
			sum += v % p > l ? l : v % p;
			System.out.printf("Case %d: %d\n", t, sum);
			t++;
		}
	}

	public static void main(String[] args) {
		new P04796___Camping().solve();
	}
}
