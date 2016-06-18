package baekjoon.solve;
import java.util.Scanner;

public class P01699___SumOfSquare {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			search(d, i);
		}

		System.out.println(d[n]);
	}

	private void search(int[] d, int n) {
		int min = n;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (min > d[n - i * i]) min = d[n - i * i];
		}

		d[n] = min + 1;
	}

	public static void main(String[] args) {
		new P01699___SumOfSquare().solve();
	}
}
