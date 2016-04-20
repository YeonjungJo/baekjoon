package baekjoon.solve;
import java.util.Scanner;

public class P01991___TreeTraversal {

	private static final Scanner sc = new Scanner(System.in);

	private static final String UPPERCASE_ALPHABET = ".ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		int n = sc.nextInt();
		int[][] t = new int[UPPERCASE_ALPHABET.length()][2];

		for (int i = 0; i < n; i++) {
			int p = get(sc.next());
			t[p][0] = get(sc.next());
			t[p][1] = get(sc.next());
		}

		preorder(t, 1);
		System.out.println();
		inorder(t, 1);
		System.out.println();
		postorder(t, 1);
	}

	private void postorder(int[][] t, int i) {
		if (i == 0) return;
		postorder(t, t[i][0]);
		postorder(t, t[i][1]);
		System.out.print(UPPERCASE_ALPHABET.charAt(i));
	}

	private void inorder(int[][] t, int i) {
		if (i == 0) return;
		inorder(t, t[i][0]);
		System.out.print(UPPERCASE_ALPHABET.charAt(i));
		inorder(t, t[i][1]);
	}

	private void preorder(int[][] t, int i) {
		if (i == 0) return;
		System.out.print(UPPERCASE_ALPHABET.charAt(i));
		preorder(t, t[i][0]);
		preorder(t, t[i][1]);
	}

	private int get(String p) {
		return UPPERCASE_ALPHABET.indexOf(p);
	}

	public static void main(String[] args) {
		new P01991___TreeTraversal().solve();
	}
}
