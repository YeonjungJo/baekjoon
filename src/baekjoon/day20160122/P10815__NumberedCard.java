package baekjoon.day20160122;
import java.util.Scanner;

public class P10815__NumberedCard {

	private boolean[] have = new boolean[20000001];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			have[sc.nextInt() + 10000000] = true;
		}

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			if (have[Integer.parseInt(sc.next()) + 10000000]) System.out.print("1 ");
			else System.out.print("0 ");
		}
	}

	public static void main(String[] args) {
		new P10815__NumberedCard().solve();
	}
}
