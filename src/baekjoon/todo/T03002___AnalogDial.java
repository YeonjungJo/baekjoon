package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T03002___AnalogDial {

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		String s = sc.next();
		for (int i = 0; i < n; i++) {
			a[i] = Character.getNumericValue(s.charAt(i));
		}

		int h = (int) Math.ceil(Math.log(n) / Math.log(2));
		int treesize = (int) (Math.pow(2, h + 1) + 1);
		long[] tree = new long[treesize];
		int[] lazy = new int[treesize];

		init(a, tree, 1, 0, n - 1);

		for (int i = 0; i < m; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			System.out.println(sum(tree, lazy, 1, 0, n - 1, start, end));
			update(tree, lazy, 1, 0, n - 1, start, end);
		}
	}

	private long init(int[] a, long[] tree, int node, int start, int end) {
		if (start == end) return tree[node] = a[start];
		return tree[node] = init(a, tree, node * 2, start, (start + end) / 2) + init(a, tree, node * 2 + 1, (start + end) / 2 + 1, end);
	}

	private long sum(long[] tree, int[] lazy, int node, int start, int end, int left, int right) {
		if (lazy[node] != 0) {
			tree[node] += (end - start + 1) * lazy[node];
			if (start != end) {
				lazy[node * 2] += lazy[node];
				lazy[node * 2 + 1] += lazy[node];
			}
			lazy[node] = 0;
		}
		if (left > end || right < start) return 0;
		if (left <= start && end <= right) return tree[node];
		return sum(tree, lazy, node * 2, start, (start + end) / 2, left, right) + sum(tree, lazy, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
	}

	private void update(long[] tree, int[] lazy, int node, int start, int end, int i, int j) {
		if (lazy[node] != 0) {
			tree[node] += (end - start + 1) * lazy[node];
			if (start != end) {
				lazy[node * 2] += lazy[node];
				lazy[node * 2 + 1] += lazy[node];
			}
			lazy[node] = 0;
		}
		if (j < start || i > end) return;
		if (i <= start && end <= j) {
			tree[node] += end - start + 1;
			if (start != end) {
				lazy[node * 2] += 1;
				lazy[node * 2 + 1] += 1;
			}
			return;
		}
		update(tree, lazy, node * 2, start, (start + end) / 2, i, j);
		update(tree, lazy, node * 2 + 1, (start + end) / 2 + 1, end, i, j);

		tree[node] = tree[node * 2] + tree[node * 2 + 1];
	}

	public static void main(String[] args) {
		sc.init();
		new T03002___AnalogDial().solve();
	}

	static class sc {
		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {}
			}

			return st.nextToken();
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}
	}

}
