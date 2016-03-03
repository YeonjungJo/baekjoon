package baekjoon.todo;
import java.util.LinkedList;
import java.util.Scanner;

public class T01068___Tree {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		Node root = new Node(-1);
		Node[] tree = new Node[51];

		for (int i = 0; i < n; i++) {
			if (tree[i] == null) tree[i] = new Node(i);
			int p = sc.nextInt();
			if (p == -1) root.addChild(tree[i]);
			else {
				if (tree[p] == null) tree[p] = new Node(p);
				tree[p].addChild(tree[i]);
			}
		}

		int leafCount = 0;

		int r = sc.nextInt();
		LinkedList<Node> stack = new LinkedList<>();
		stack.add(root);
		while (!stack.isEmpty()) {
			Node i = stack.pop();
			if (i.getChild(tree[r]).size() == 0) leafCount++;
			else stack.addAll(i.getChild(tree[r]));
		}
		System.out.println(leafCount);
	}

	class Node {
		int id;
		LinkedList<Node> child = new LinkedList<Node>();

		public Node(int id) {
			this.id = id;
		}

		public void addChild(Node node) {
			child.add(node);
		}

		public LinkedList<Node> getChild(Node r) {
			child.remove(r);
			return child;
		}
	}

	public static void main(String[] args) {
		new T01068___Tree().solve();
	}
}
