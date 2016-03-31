package baekjoon.todo;
import java.util.Scanner;

public class T01991___Tree {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		String[] t = new String[(int) Math.pow(2, n + 1)];
		t[1] = "A";
		for (int i = 0; i < n; i++) {
			int index = findParentNodeIndex(t, sc.next());
			t[2 * index] = sc.next();
			t[2 * index + 1] = sc.next();
		}

		preorder(t, 1);
		System.out.println();
		inorder(t, 1);
		System.out.println();
		postorder(t, 1);
		System.out.println();
	}

	private void postorder(String[] t, int i) {
		if (i * 2 < t.length) {
			if (!t[i * 2].equals(".") && t[i * 2] != null) postorder(t, i * 2);
			if (!t[i * 2 + 1].equals(".") && t[i * 2 + 1] != null) postorder(t, i * 2 + 1);
		}
		System.out.print(t[i]);
	}

	private void inorder(String[] t, int i) {
		if (i * 2 < t.length) {
			if (!t[i * 2].equals(".") && t[i * 2] != null) inorder(t, i * 2);
			System.out.print(t[i]);
			if (!t[i * 2 + 1].equals(".") && t[i * 2 + 1] != null) inorder(t, i * 2 + 1);
		}
	}

	private void preorder(String[] t, int i) {
		System.out.print(t[i]);
		if (i * 2 < t.length) {
			if (!t[i * 2].equals(".") && t[i * 2] != null) preorder(t, i * 2);
			if (!t[i * 2 + 1].equals(".") && t[i * 2 + 1] != null) preorder(t, i * 2 + 1);
		}
	}

	private int findParentNodeIndex(String[] t, String node) {
		for (int i = 1; i < t.length; i++) {
			if (t[i] != null && t[i].equals(node)) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		new T01991___Tree().solve();
	}
}
