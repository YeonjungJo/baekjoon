package baekjoon.solve;
import java.util.Scanner;

public class P02018___SumOfNumbers {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int count = 1;

		for (int i = 1; i <= n / 2; i++) {
			int tmp = 0;
			for (int j = i; tmp < n; j++) {
				tmp += j;
				if (tmp == n) {
					count++;
					break;
				}
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new P02018___SumOfNumbers().solve();
	}
}
