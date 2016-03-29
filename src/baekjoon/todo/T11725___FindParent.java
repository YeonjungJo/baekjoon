package baekjoon.todo;
import java.util.Scanner;

public class T11725___FindParent {

	private static final Scanner sc = new Scanner(System.in);

	private static final int ROOT = 1;

	private void solve() {
		int n = sc.nextInt();
		boolean[][] d = new boolean[n + 1][n + 1];
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			d[a][b] = d[b][a] = true;
		}

		Node[] tree = new Node[n + 1];
		search(tree, d, ROOT);

		for (int i = 2; i <= n; i++) {
			if(tree[i] == null) System.out.println("1");
			else System.out.println(tree[i].parentNode);
		}
	}

	private void search(Node[] tree, boolean[][] d, int parent) {
		for (int i = 2; i < d.length; i++) {
			if (i != parent && d[parent][i] && tree[i] == null) {
				tree[i] = new Node(parent);
				search(tree, d, i);
			}
		}
	}

	public class Node {
		int parentNode;

		public Node(int parentNode) {
			this.parentNode = parentNode;
		}
	}

	public static void main(String[] args) {
		new T11725___FindParent().solve();
	}
}
