package baekjoon.solve;
import java.util.Scanner;

public class P01418___KSaeJoonSoo {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i <= k || search(i, k)) count++;
		}
		System.out.println(count);
	}

	private boolean search(int n, int k) {
		for (int i = 2; i <= n && i <= k; i++) {
			if (n % i == 0) {
				n /= i;
				i = 1;
			}
			if (n <= k) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		new P01418___KSaeJoonSoo().solve();
	}
}
