package baekjoon.solve;
import java.util.Scanner;

public class P01392___SheetMusic {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[100 * n];
		int c = 0;
		for (int i = 1; i <= n; i++) {
			int tmp = sc.nextInt() + c;
			for (; c < tmp; c++) {
				a[c] = i;
			}
		}
		
		for (int i = 0; i < q; i++) {
			System.out.println(a[sc.nextInt()]);
		}
	}

	public static void main(String[] args) {
		new P01392___SheetMusic().solve();
	}
}
