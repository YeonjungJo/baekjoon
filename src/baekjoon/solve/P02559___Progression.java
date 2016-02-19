package baekjoon.solve;
import java.util.Scanner;

public class P02559___Progression {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] temperature = new int[n];
		long max = Long.MIN_VALUE;
		long tmp = 0;
		for (int i = 0; i < n; i++) {
			temperature[i] = sc.nextInt();
			tmp += temperature[i];
			if (i == k - 1) max = tmp;
			if (i >= k) {
				tmp -= temperature[i - k];
				max = tmp > max ? tmp : max;
			}
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		new P02559___Progression().solve();
	}
}
