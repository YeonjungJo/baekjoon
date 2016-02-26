package baekjoon.todo;
import java.util.Scanner;

public class T01395___Switch {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int h = (int) Math.ceil(Math.log(n) / Math.log(2));
		int treesize = (int) (Math.pow(2, h + 1) + 1);
		int[] tree = new int[treesize];

		for (int i = 0; i < m; i++) {
			switch (sc.nextInt()) {
			case 0:
				update(tree, 1, 0, n - 1, sc.nextInt() - 1, sc.nextInt() - 1);
				break;
			case 1:
				System.out.println(count(tree, 1, 0, n - 1, sc.nextInt() - 1, sc.nextInt() - 1));
				break;
			}
		}
	}

	private int update(int[] tree, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return tree[node];
		if (start == end) return tree[node] = tree[node] == 1 ? 0 : 1;
		return tree[node] = update(tree, 2 * node, start, (start + end) / 2, left, right) + update(tree, 2 * node + 1, (start + end) / 2 + 1, end, left, right);
	}

	private int count(int[] tree, int node, int start, int end, int left, int right) {
		if (start > right || end < left) return 0;
		if (left <= start && end <= right) return tree[node];
		return count(tree, 2 * node, start, (start + end) / 2, left, right) + count(tree, 2 * node + 1, (start + end) / 2 + 1, end, left, right);
	}

	public static void main(String[] args) {
		new T01395___Switch().solve();
	}
}
