package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01448___MakeTriangle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		for (int i = n - 1; i > 1; i--) {
			if (a[i] < a[i - 1] + a[i - 2]) {
				System.out.println(a[i] + a[i - 1] + a[i - 2]);
				return;
			}
		}
		System.out.println(-1);
	}

	public static void main(String[] args) {
		new P01448___MakeTriangle().solve();
	}
}
