package baekjoon.todo;
import java.util.Scanner;

public class T01520___Downhill_recursive {

	private static final Scanner sc = new Scanner(System.in);

	private static final int U = 0;
	private static final int D = 1;
	private static final int L = 2;
	private static final int R = 3;

	private void solve() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] map = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int[][][] d = new int[m][n][4];
		find(d, map, m, n, 0, 0, Integer.MAX_VALUE, 0);
		System.out.println(d[0][0][0]);
	}

	private int find(int[][][] d, int[][] map, int m, int n, int i, int j, int before, int dir) {
		if (i >= m || j >= n || i < 0 || j < 0 || map[i][j] >= before) return 0;
		if (i == m - 1 && j == n - 1) return 1;
		if(d[i][j][dir] !=0 ) return d[i][j][dir];
		return d[i][j][dir] = find(d, map, m, n, i - 1, j, map[i][j], U) + find(d, map, m, n, i + 1, j, map[i][j], D)
				+ find(d, map, m, n, i, j - 1, map[i][j], L) + find(d, map, m, n, i, j + 1, map[i][j], R);
	}

	public static void main(String[] args) {
		new T01520___Downhill_recursive().solve();
	}
}
