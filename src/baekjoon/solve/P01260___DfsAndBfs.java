package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P01260___DfsAndBfs {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int root = sc.nextInt();

		boolean[][] graph = new boolean[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = true;
			graph[b][a] = true;
		}

		boolean[] dfs = new boolean[n + 1];
		boolean[] bfs = new boolean[n + 1];
		bfs[root] = true;
		LinkedList<Integer> stack = new LinkedList<>();
		stack.add(root);
		System.out.println(dfs(dfs, graph, n, root, new StringBuilder()).toString());
		System.out.println(bfs(bfs, graph, n, stack, new StringBuilder()));
	}

	private StringBuilder bfs(boolean[] bfs, boolean[][] graph, int n, LinkedList<Integer> stack, StringBuilder stringBuilder) {
		if(stack.isEmpty()) return stringBuilder;
		
		int node = stack.pop();
		stringBuilder.append(node).append(" ");
		for (int i = 1; i <= n; i++) {
			if (graph[node][i] && !bfs[i]) {
				stack.add(i);
				bfs[i] = true;
			}
		}
		return bfs(bfs, graph, n, stack, stringBuilder);
	}

	private StringBuilder dfs(boolean[] dfs, boolean[][] graph, int n, int node, StringBuilder stringBuilder) {
		stringBuilder.append(node).append(" ");
		dfs[node] = true;
		for (int i = 1; i <= n; i++) {
			if (graph[node][i] && !dfs[i]) dfs(dfs, graph, n, i, stringBuilder);
		}
		return stringBuilder;
	}

	public static void main(String[] args) {
		new P01260___DfsAndBfs().solve();
	}
}
