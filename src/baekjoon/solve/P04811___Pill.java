package baekjoon.solve;
import java.util.Scanner;

public class P04811___Pill {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;

			long[][] d = new long[n + 1][n + 1];
			System.out.println(search(d, n, 0, 0));
		}
	}

	private long search(long[][] d, int n, int w, int h) {
		if (w < h || w > n || h > n) return 0;
		if (w == n && h == n) return 1;
		if (d[w][h] != 0) return d[w][h];
		if (w == h) return d[w][h] = search(d, n, w + 1, h);
		return d[w][h] = search(d, n, w + 1, h) + search(d, n, w, h + 1);
	}

	public static void main(String[] args) {
		new P04811___Pill().solve();
	}
}
