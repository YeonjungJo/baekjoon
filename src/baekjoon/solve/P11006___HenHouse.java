package baekjoon.solve;
import java.util.Scanner;

public class P11006___HenHouse {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			System.out.printf("%d %d\n", 2 * m - n, m - 2 * m + n);
		}
	}

	public static void main(String[] args) {
		new P11006___HenHouse().solve();
	}
}
