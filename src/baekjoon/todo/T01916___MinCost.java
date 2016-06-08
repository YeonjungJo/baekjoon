package baekjoon.todo;
import java.util.Arrays;
import java.util.Scanner;

public class T01916___MinCost {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MAX_VALUE = 100000000;
	private static final int NOT_AVAILABLE = -1;

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(a[i], NOT_AVAILABLE);
		}

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int cost = sc.nextInt();
			if (a[x][y] == NOT_AVAILABLE || a[x][y] > cost) a[x][y] = cost;
		}
		int start = sc.nextInt() - 1;
		int end = sc.nextInt() - 1;

		long[] d = new long[n];
		search(d, a, n, end, start);
		System.out.println(d[start]);
	}

	private long search(long[] d, int[][] a, int n, int end, int p) {
		if (p == end) return 0;
		if (d[p] != 0) return d[p];

		long min = MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[p][i] != NOT_AVAILABLE) {
				long tmp = a[p][i] + search(d, a, n, end, i);
				if (tmp < min) min = tmp;
			}
		}
		return d[p] = min >= MAX_VALUE ? MAX_VALUE : min;
	}

	public static void main(String[] args) {
		new T01916___MinCost().solve();
	}
}
