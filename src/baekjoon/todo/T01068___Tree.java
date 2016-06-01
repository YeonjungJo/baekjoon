package baekjoon.todo;

import java.util.Scanner;

public class T01068___Tree {

	private static final Scanner sc = new Scanner(System.in);

	private static final int ROOT = -1;
	private static final int REMOVE = -2;

	private void solve() {
		int n = sc.nextInt();
		int[] parent = new int[n];
		int[] cntChildNode = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = sc.nextInt();
			if (parent[i] != ROOT) cntChildNode[parent[i]]++;
		}

		int m = sc.nextInt();
		free(cntChildNode, parent, n, m);

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (parent[i] != REMOVE && cntChildNode[i] == 0) count++;
		}
		System.out.println(count);
	}

	private void free(int[] cntChildNode, int[] parent, int n, int m) {
		if (parent[m] < 0) return;

		cntChildNode[parent[m]]--;
		parent[m] = REMOVE;
		for (int i = 0; i < n; i++) {
			if (parent[i] == m) free(cntChildNode, parent, n, i);
		}
	}

	public static void main(String[] args) {
		new T01068___Tree().solve();
	}
}
