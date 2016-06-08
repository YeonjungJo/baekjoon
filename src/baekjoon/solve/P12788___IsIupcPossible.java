package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P12788___IsIupcPossible {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);

		int a = m * k;
		for (int i = 0; i < n; i++) {
			a -= h[n - i - 1];
			if (a <= 0) {
				System.out.println(i + 1);
				return;
			}
		}

		System.out.println("STRESS");
	}

	public static void main(String[] args) {
		new P12788___IsIupcPossible().solve();
	}
}
