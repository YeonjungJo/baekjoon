package baekjoon.solve;
import java.util.Scanner;

public class P04892___PlayTheNumbers {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ODD = "odd";
	private static final String EVEN = "even";

	private void solve() {
		int testcase = 1;
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;

			System.out.printf("%d. %s %d\n", testcase++, n % 2 == 0 ? EVEN : ODD, n / 2);
		}
	}

	public static void main(String[] args) {
		new P04892___PlayTheNumbers().solve();
	}
}
