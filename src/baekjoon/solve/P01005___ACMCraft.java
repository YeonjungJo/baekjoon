package baekjoon.solve;
import java.util.Scanner;

public class P01005___ACMCraft {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			long[] buildTime = new long[n];
			for (int i = 0; i < n; i++)
				buildTime[i] = sc.nextInt();

			boolean[][] order = new boolean[n][n];
			for (int i = 0; i < k; i++) {
				order[sc.nextInt() - 1][sc.nextInt() - 1] = true;
			}
			int goal = sc.nextInt() - 1;

			long[] d = new long[n];
			System.out.println(search(order, buildTime, d, goal));
		}
	}

	private long search(boolean[][] order, long[] buildTime, long[] d, int goal) {
		if (d[goal] != 0) return d[goal];
		long max = 0;
		for (int i = 0; i < d.length; i++) {
			if (order[i][goal]) {
				long tmp = search(order, buildTime, d, i);
				max = tmp > max ? tmp : max;
			}
		}
		return d[goal] = buildTime[goal] + max;
	}

	public static void main(String[] args) {
		new P01005___ACMCraft().solve();
	}
}
