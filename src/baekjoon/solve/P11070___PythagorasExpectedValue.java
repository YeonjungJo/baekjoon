package baekjoon.solve;
import java.util.Scanner;

public class P11070___PythagorasExpectedValue {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] win = new int[n + 1];
			int[] lose = new int[n + 1];
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();

				win[a] += p;
				win[b] += q;
				lose[a] += q;
				lose[b] += p;
			}

			double min = Double.MAX_VALUE;
			double max = Double.MIN_VALUE;

			for (int i = 1; i <= n; i++) {
				double tmp = 0;
				if (win[i] != 0 || lose[i] != 0) tmp = Math.pow(win[i], 2) / (Math.pow(win[i], 2) + Math.pow(lose[i], 2));
				if (tmp > max) max = tmp;
				if (tmp < min) min = tmp;
			}

			System.out.println((int) (max * 1000));
			System.out.println((int) (min * 1000));
		}
	}

	public static void main(String[] args) {
		new P11070___PythagorasExpectedValue().solve();
	}
}
