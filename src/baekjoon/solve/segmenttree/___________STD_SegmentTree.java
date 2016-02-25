package baekjoon.solve.segmenttree;
import java.util.Scanner;

public class ___________STD_SegmentTree {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] a = new long[n];

		int h = (int) Math.ceil(Math.log(n) / Math.log(2));
		int treesize = (int) (Math.pow(2, h + 1) + 1);
		long[] tree = new long[treesize];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		init(a, tree, 1, 0, n - 1);

		for (int i = 0; i < m; i++) {
			System.out.println(sum(tree, 1, 0, n - 1, sc.nextInt(), sc.nextInt()));
		}
	}

	private long init(long[] a, long[] tree, int node, int start, int end) {
		if (start == end) return tree[node] = a[start];
		return tree[node] = init(a, tree, node * 2, start, (start + end) / 2) + init(a, tree, node * 2 + 1, (start + end) / 2 + 1, end);
	}

	private long sum(long[] tree, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return 0;
		if (left <= start && end <= right) return tree[node];
		return sum(tree, node * 2, start, (start + end) / 2, left, right) + sum(tree, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
	}

	public static void main(String[] args) {
		new ___________STD_SegmentTree().solve();
	}
}
