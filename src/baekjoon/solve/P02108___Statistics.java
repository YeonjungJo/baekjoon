package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P02108___Statistics {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] number = new int[n];
		int[] freq = new int[8001];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
			sum += number[i];
			freq[number[i] + 4000]++;
		}

		Arrays.sort(number);

		// arithmetic mean
		System.out.println(Math.round(sum / (float) n));

		// median value
		System.out.println(number[n / 2]);

		// mode
		final int EMPTY = -1;
		int result = EMPTY;
		int count = 1;
		int second = EMPTY;

		for (int i = 0; i < freq.length; i++) {
			if (second == EMPTY && count == freq[i]) {
				second = result;
				result = i;
			} else if (count < freq[i]) {
				count = freq[i];
				result = i;
				second = EMPTY;
			}
		}

		System.out.println(result - 4000);

		// range
		System.out.println(number[n - 1] - number[0]);
	}

	public static void main(String[] args) {
		new P02108___Statistics().solve();
	}
}
