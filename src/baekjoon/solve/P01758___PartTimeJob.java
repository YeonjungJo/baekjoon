package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01758___PartTimeJob {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		long tip = 0;
		for (int i = 0; i < n; i++) {
			int tmp = a[n - i - 1] - i;
			if(tmp <= 0) break;
			tip += tmp;
			
		}
		System.out.println(tip);
	}

	public static void main(String[] args) {
		new P01758___PartTimeJob().solve();
	}
}
