package baekjoon.solve;
import java.util.Scanner;

public class P02877___4and7 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int idx = 0;

		for (int i = 1;; i++) {
			int tmp = (int) Math.pow(2, i);
			if (idx + tmp >= n) {
				System.out.println(findNumber(i, n));
				return;
			} else idx += tmp;
		}
	}

	private String findNumber(int digits, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = digits; i > 0; i--) {
			result.append((n + 1) % Math.pow(2, i) < Math.pow(2, i) / 2 ? "4" : "7");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		new P02877___4and7().solve();
	}
}
