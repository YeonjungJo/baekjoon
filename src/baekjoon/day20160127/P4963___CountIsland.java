package baekjoon.day20160127;
import java.util.Scanner;

public class P4963___CountIsland {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) return;

			boolean[][] map = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (sc.nextInt() == 1) map[i][j] = true;
				}
			}

			int count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j]) {
						count++;
						getIsland(map, i, j);
					}
				}
			}

			System.out.println(count);
		}
	}

	private void getIsland(boolean[][] map, int i, int j) {
		if (!map[i][j]) return;
		map[i][j] = false;
		int h = map.length;
		int w = map[0].length;

		if (i > 0 && j > 0) getIsland(map, i - 1, j - 1);
		if (i > 0) getIsland(map, i - 1, j);
		if (i > 0 && j < w - 1) getIsland(map, i - 1, j + 1);
		if (j > 0) getIsland(map, i, j - 1);
		if (j < w - 1) getIsland(map, i, j + 1);
		if (i < h - 1 && j > 0) getIsland(map, i + 1, j - 1);
		if (i < h - 1) getIsland(map, i + 1, j);
		if (i < h - 1 && j < w - 1) getIsland(map, i + 1, j + 1);
	}

	public static void main(String[] args) {
		new P4963___CountIsland().solve();
	}
}
