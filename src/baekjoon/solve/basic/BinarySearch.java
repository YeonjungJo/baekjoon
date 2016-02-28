package baekjoon.solve.basic;
import java.util.Scanner;

public class BinarySearch {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] tree = new int[n];

		int max = 0;
		for (int i = 0; i < n; i++) {
			tree[i] = sc.nextInt();
			if (max < tree[i]) max = tree[i];
		}

		int left = 0;
		int right = max;
		int h = max;

		while (true) {
			if (cut(tree, h, m)) {
				if (!cut(tree, h + 1, m)) {
					System.out.println(h);
					return;
				} else {
					left = h;
					h = (h + right) / 2;
				}
			} else {
				right = h;
				h = (left + h) / 2;
			}
		}
	}

	private boolean cut(int[] tree, int h, int m) {
		int wood = 0;
		for (int i = 0; i < tree.length; i++) {
			if (tree[i] >= h) wood += tree[i] - h;
			if (wood >= m) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		new BinarySearch().solve();
	}
}
