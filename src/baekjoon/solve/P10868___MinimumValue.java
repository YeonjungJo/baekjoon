package baekjoon.solve;
import java.util.Scanner;

public class P10868___MinimumValue {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] a = new long[n];

		int h = (int) Math.ceil(Math.log(n) / Math.log(2));
		int treesize = (int) (Math.pow(2, h + 1) + 1);
		Node[] tree = new Node[treesize];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		tree[1] = new Node(0, n - 1);
		tree[1].value = init(a, tree, 1);

		for (int i = 0; i < m; i++) {
			System.out.println(min(tree, 1, 0, n - 1, sc.nextInt() - 1, sc.nextInt() - 1));
		}
	}

	private long init(long[] a, Node[] tree, int node) {
		if (tree[node].start == tree[node].end) return tree[node].value = a[tree[node].start];

		Node left = new Node(tree[node].start, (tree[node].start + tree[node].end) / 2);
		Node right = new Node((tree[node].start + tree[node].end) / 2 + 1, tree[node].end);

		tree[node * 2] = left;
		tree[node * 2 + 1] = right;

		left.value = init(a, tree, node * 2);
		right.value = init(a, tree, node * 2 + 1);

		return left.value > right.value ? right.value : left.value;
	}

	private long min(Node[] tree, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return Long.MAX_VALUE;
		if (left <= start && end <= right) return tree[node].value;
		long l = min(tree, node * 2, start, (start + end) / 2, left, right);
		long r = min(tree, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
		return l < r ? l : r;
	}

	private class Node {
		int start;
		int end;
		long value = Long.MAX_VALUE;

		public Node(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return String.format("[%d - %d] : %d", start, end, value);
		}
	}

	public static void main(String[] args) {
		new P10868___MinimumValue().solve();
	}
}
