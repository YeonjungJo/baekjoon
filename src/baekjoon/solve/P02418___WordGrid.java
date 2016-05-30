package baekjoon.solve;
import java.util.Scanner;

public class P02418___WordGrid {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[][] DIRECTION = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };

	private void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		int l = sc.nextInt();

		char[][] grid = new char[h][w];
		for (int i = 0; i < h; i++) {
			grid[i] = sc.next().toCharArray();
		}
		char[] word = sc.next().toCharArray();

		long[][][] d = new long[h][w][l];
		long count = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (grid[i][j] == word[0]) count += search(d, grid, word, h, w, l, i, j, 0);
			}
		}
		System.out.println(count);
	}

	private long search(long[][][] d, char[][] grid, char[] word, int h, int w, int l, int i, int j, int idx) {
		if (i < 0 || j < 0 || i >= h || j >= w || idx >= l) return 0;
		if (grid[i][j] != word[idx]) return 0;
		if (idx == l - 1) return d[i][j][idx] = 1;
		if(d[i][j][idx] != 0) return d[i][j][idx];

		long count = 0;
		for (int dir = 0; dir < DIRECTION.length; dir++) {
			count += search(d, grid, word, h, w, l, i + DIRECTION[dir][0], j + DIRECTION[dir][1], idx + 1);
		}
		return d[i][j][idx] = count;
	}

	public static void main(String[] args) {
		new P02418___WordGrid().solve();
	}
}
