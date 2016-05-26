package baekjoon.solve;
import java.util.Scanner;

public class P02435___WeatherCenterIntern {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MIN_VALUE = -100 * 100;

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] temperature = new int[n];

		int sum = 0;
		int max = MIN_VALUE;
		for (int i = 0; i < n; i++) {
			temperature[i] = sc.nextInt();
			sum += temperature[i];
			if (i >= k) sum -= temperature[i - k];
			if (i >= k - 1 && max < sum) max = sum;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		new P02435___WeatherCenterIntern().solve();
	}
}
