package baekjoon.solve;
import java.util.Scanner;

public class P09095___123Plus {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		int[] d = new int[11];
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			System.out.println(search(d, n));
		}
	}

	private int search(int[] d, int n) {
		if (n <= 0) return 0;
		if (n == 1) return 1;
		if (n == 2) return 2;
		if (n == 3) return 4;
		if (d[n] != 0) return d[n];
		return d[n] = search(d, n - 1) + search(d, n - 2) + search(d, n - 3);
	}

	public static void main(String[] args) {
		new P09095___123Plus().solve();
	}
}
