package baekjoon.solve;
import java.util.Scanner;

public class P01977___PerfectSquareNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int m = sc.nextInt();
		int n = sc.nextInt();

		long sum = 0;
		int min = 0;

		for (int i = m; i <= n; i++) {
			if (Math.sqrt(i) == (int) Math.sqrt(i)) {
				sum += i;
				if (min == 0) min = i;
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new P01977___PerfectSquareNumber().solve();
	}
}
