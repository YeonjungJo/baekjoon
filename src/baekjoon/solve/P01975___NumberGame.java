package baekjoon.solve;
import java.util.Scanner;

public class P01975___NumberGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int result = 0;
			for (int i = 2; i <= n; i++) {
				result += conversion(n, i);
			}
			System.out.println(result);
		}
	}

	private int conversion(int n, int i) {
		int result = 0;
		while (n > 0) {
			if (n % i == 0) {
				result++;
				n /= i;
			} else return result;
		}
		return result;
	}

	public static void main(String[] args) {
		new P01975___NumberGame().solve();
	}
}
