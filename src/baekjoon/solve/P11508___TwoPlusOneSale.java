package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P11508___TwoPlusOneSale {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int result = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 != 2) result += a[n - 1 - i];
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new P11508___TwoPlusOneSale().solve();
	}
}
