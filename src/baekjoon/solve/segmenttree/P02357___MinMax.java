package baekjoon.solve.segmenttree;
import java.util.Scanner;

public class P02357___MinMax {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] d = new long[n];

		int h = (int) Math.ceil(Math.log(n) / Math.log(2));
		int treesize = (int) (Math.pow(2, h + 1) + 1);
		long[] mintree = new long[treesize];
		long[] maxtree = new long[treesize];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		for (int i = 0; i < treesize; i++) {
			mintree[i] = Long.MAX_VALUE;
			maxtree[i] = Long.MIN_VALUE;
		}

		minInit(d, mintree, 1, 0, n - 1);
		maxInit(d, maxtree, 1, 0, n - 1);

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			System.out.print(min(mintree, 1, 0, n - 1, a, b) + " ");
			System.out.println(max(maxtree, 1, 0, n - 1, a, b));
		}
	}

	private long minInit(long[] a, long[] tree, int node, int start, int end) {
		if (start == end) return tree[node] = a[start];
		long left = minInit(a, tree, node * 2, start, (start + end) / 2);
		long right = minInit(a, tree, node * 2 + 1, (start + end) / 2 + 1, end);
		return tree[node] = left > right ? right : left;
	}

	private long maxInit(long[] a, long[] tree, int node, int start, int end) {
		if (start == end) return tree[node] = a[start];
		long left = maxInit(a, tree, node * 2, start, (start + end) / 2);
		long right = maxInit(a, tree, node * 2 + 1, (start + end) / 2 + 1, end);
		return tree[node] = left < right ? right : left;
	}

	private long min(long[] tree, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return Long.MAX_VALUE;
		if (left <= start && end <= right) return tree[node];
		long l = min(tree, node * 2, start, (start + end) / 2, left, right);
		long r = min(tree, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
		return l < r ? l : r;
	}

	private long max(long[] tree, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return Long.MIN_VALUE;
		if (left <= start && end <= right) return tree[node];
		long l = max(tree, node * 2, start, (start + end) / 2, left, right);
		long r = max(tree, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
		return l > r ? l : r;
	}

	public static void main(String[] args) {
		new P02357___MinMax().solve();
	}
}
