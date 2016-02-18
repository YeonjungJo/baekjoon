package baekjoon.solve;
import java.util.Scanner;

public class P04504___FindMultiple {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		while (true) {
			int k = sc.nextInt();
			if (k == 0) return;
			if (k % n == 0) System.out.printf("%d is a multiple of %d.\n", k, n);
			else System.out.printf("%d is NOT a multiple of %d.\n", k, n);
		}
	}

	public static void main(String[] args) {
		new P04504___FindMultiple().solve();
	}
}
