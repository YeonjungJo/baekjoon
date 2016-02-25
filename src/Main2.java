import java.util.Scanner;

public class Main2 {

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

		for (int i = 0; i < treesize; i++) {
			tree[i] = Long.MAX_VALUE;
		}

		init(a, tree, 1, 0, n - 1);

		for (int i = 0; i < m; i++) {
			System.out.println(min(tree, 1, 0, n - 1, sc.nextInt() - 1, sc.nextInt() - 1));
		}
	}

	private long init(long[] a, long[] tree, int node, int start, int end) {
		if (start == end) return tree[node] = a[start];
		long left = init(a, tree, node * 2, start, (start + end) / 2);
		long right = init(a, tree, node * 2 + 1, (start + end) / 2 + 1, end);
		return left > right ? right : left;
	}

	private long min(long[] tree, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return Long.MAX_VALUE;
		if (left <= start && end <= right) return tree[node];
		long l = min(tree, node * 2, start, (start + end) / 2, left, right);
		long r = min(tree, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
		return l < r ? l : r;
	}

	public static void main(String[] args) {
		new Main2().solve();
	}
}
