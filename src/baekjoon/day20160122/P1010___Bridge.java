package baekjoon.day20160122;
import java.util.Scanner;

public class P1010___Bridge {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			// mCn

			long combination = 1;
			int r = m - n > n ? n : m - n;
			for (int c = m; c > 1; c--) {
				if (c > m - r) combination *= c;
				if (c <= r) combination /= c;
			}

			if (n == 0) System.out.println(0);
			else System.out.println(combination);
		}
	}

	public static void main(String[] args) {
		new P1010___Bridge().solve();
	}
}
