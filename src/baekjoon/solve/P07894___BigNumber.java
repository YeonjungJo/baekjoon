package baekjoon.solve;
import java.util.Scanner;

public class P07894___BigNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			System.out.println((int) factorialDigits(n));
		}
	}

	private double factorialDigits(int n) {
		double result = 1;
		for (int i = 1; i <= n; i++) {
			result += Math.log10(i);
		}
		return result;
	}

	public static void main(String[] args) {
		new P07894___BigNumber().solve();
	}
}
