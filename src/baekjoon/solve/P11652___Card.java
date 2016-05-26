package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P11652___Card {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);

		long maxValue = a[0];
		int max = 0;
		int tmp = 1;
		for (int i = 1; i < n; i++) {
			if (a[i - 1] == a[i]) tmp++;
			else tmp = 1;
			if (max < tmp) {
				max = tmp;
				maxValue = a[i];
			}
		}

		System.out.println(maxValue);
	}

	public static void main(String[] args) {
		new P11652___Card().solve();
	}
}
