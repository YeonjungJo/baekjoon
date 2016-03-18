package baekjoon.solve;
import java.util.Scanner;

public class P02837___DongjunMadeGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int sum = 0;
		int max = a[n - 1] - 1;
		for (int i = n - 2; i >= 0; i--) {
			if (max > a[i]) max = a[i];
			else {
				sum += a[i] - max;
			}
			max--;
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new P02837___DongjunMadeGame().solve();
	}
}
