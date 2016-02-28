package baekjoon.todo;
import java.util.Scanner;

public class T11048___Move {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] maze = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				maze[i][j] = sc.nextInt();
			}
		}

		int[][] d = new int[n][m];
		System.out.println(find(d, maze, n, m, 0, 0));

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}

	private int find(int[][] d, int[][] maze, int n, int m, int i, int j) {
		if (i >= n || j >= m) return 0;
		if (i == n - 1 && j == m - 1) return d[i][j] = maze[i][j];
		if (d[i][j] != 0) return d[i][j] = maze[i][j];
		return d[i][j] = maze[i][j] + max(find(d, maze, n, m, i + 1, j), find(d, maze, n, m, i, j + 1), find(d, maze, n, m, i + 1, j + 1));
	}

	private int max(int a, int b, int c) {
		return a > b ? a > c ? a : c : b > c ? b : c;
	}

	public static void main(String[] args) {
		new T11048___Move().solve();
	}
}
