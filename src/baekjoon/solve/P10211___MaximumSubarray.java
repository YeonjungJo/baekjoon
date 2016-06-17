package baekjoon.solve;
import java.util.Scanner;

public class P10211___MaximumSubarray {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MIN_VALUE = -1000;

	private void init() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			solve();
		}
	}

	private void solve() {
		int n = sc.nextInt();

		int sum = 0;
		int max = MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();

			if (sum + tmp >= 0) {
				sum += tmp;
				if (sum > max) max = sum;
			} else {
				if (tmp > max) max = tmp;
				sum = 0;
			}
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		new P10211___MaximumSubarray().init();
	}
}
