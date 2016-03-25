package baekjoon.solve;
import java.util.Scanner;

public class P09934___FullBinaryTree {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int depth = sc.nextInt();
		int tree_size = (int) (Math.pow(2, depth) - 1);

		int[] a = new int[tree_size];
		for (int i = 0; i < tree_size; i++) {
			a[i] = sc.nextInt();
		}

		int[] t = new int[tree_size + 1];
		set(t, a, 1, 0, tree_size - 1);

		for (int i = 0, k = 1; i < depth; i++) {
			for (int j = 1; j <= Math.pow(2, i); j++, k++) {
				System.out.print(t[k] + " ");
			}
			System.out.println();
		}
	}

	private void set(int[] t, int[] a, int n, int start, int end) {
		if (start == end) {
			t[n] = a[start];
			return;
		}
		t[n] = a[start + ((end - start) / 2)];
		set(t, a, 2 * n, start, start + (end - start) / 2 - 1);
		set(t, a, 2 * n + 1, start + (end - start) / 2 + 1, end);
	}

	public static void main(String[] args) {
		new P09934___FullBinaryTree().solve();
	}
}
