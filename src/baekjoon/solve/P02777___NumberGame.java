package baekjoon.solve;
import java.util.Scanner;

public class P02777___NumberGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			System.out.println(findFactor(n));
		}
	}

	private int findFactor(int n) {
		if(n == 1) return 1;
		int result = 0;
		Loop1: while (true) {
			for (int i = 9; i >= 2; i--) {
				if(n == 1) return result;
				if (n % i == 0) {
					result++;
					n /= i;
					continue Loop1;
				}
			}
			return -1;
		}
	}

	public static void main(String[] args) {
		new P02777___NumberGame().solve();
	}
}
