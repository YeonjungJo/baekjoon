package baekjoon.solve;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class P02470___Solution {
	/*
	 * slidingWindowAlgorithm
	 */

	private static final Scanner sc = new Scanner(System.in);

	private static final int MAX_VALUE = 2000000000;

	private void solve() {
		int t = sc.nextInt();

		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();

		for (int i = 0; i < t; i++) {
			int tmp = sc.nextInt();
			if (tmp >= 0) a.add(tmp);
			else b.add(tmp);
		}

		Integer[] acid = a.toArray(new Integer[a.size()]);
		Integer[] base = b.toArray(new Integer[b.size()]);
		Arrays.sort(acid);
		Arrays.sort(base);

		int n = acid.length;
		int m = base.length;

		if (n == 0) {
			System.out.printf("%d %d", base[m - 2], base[m - 1]);
			return;
		}
		if (m == 0) {
			System.out.printf("%d %d", acid[0], acid[1]);
			return;
		}

		int min = MAX_VALUE;
		int x = 0;
		int y = 0;
		for (int i = 0; i < m; i++) {
			int tmp = MAX_VALUE;
			for (int j = 0; j < n; j++) {
				int k = mix(base[i], acid[j]);
				if (k < min) {
					min = k;
					x = i;
					y = j;
				}
				if (k >= tmp) break;
			}
		}

		System.out.printf("%d %d", base[x], acid[y]);
	}

	private int mix(int i, int j) {
		return Math.abs(i + j);
	}

	public static void main(String[] args) {
		new P02470___Solution().solve();
	}
}
