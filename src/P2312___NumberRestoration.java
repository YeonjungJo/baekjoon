import java.util.Scanner;

public class P2312___NumberRestoration {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();

			int[] factor = new int[n + 1];

			int tmp = n;

			for (int i = 2; i <= tmp; i++) {
				if (tmp % i == 0) {
					factor[i]++;
					tmp /= i;
					i = 1;
				}
			}
			for (int i = 2; i <= n; i++) {
				if (factor[i] != 0) System.out.printf("%d %d\n", i, factor[i]);
			}
		}
	}

	public static void main(String[] args) {
		new P2312___NumberRestoration().solve();
	}
}
