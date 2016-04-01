package baekjoon.solve;
import java.util.Scanner;

public class P01205___GetRank {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();

		int rank = 1;
		boolean b = false;
		for (int i = 0; i < n && i < p; i++) {
			int tmp = sc.nextInt();
			if (!b && tmp == m) {
				rank = i + 1;
				b = true;
			}
			if (m > tmp) {
				if (b) System.out.println(rank);
				else System.out.println(i + 1);
				return;
			}
		}

		if (n < p) {
			if (b) System.out.println(rank);
			else System.out.println(n + 1);
		} else System.out.println(-1);
	}

	public static void main(String[] args) {
		new P01205___GetRank().solve();
	}
}
