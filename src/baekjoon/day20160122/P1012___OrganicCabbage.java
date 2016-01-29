package baekjoon.day20160122;
import java.util.Scanner;

public class P1012___OrganicCabbage {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();

			boolean[][] map = new boolean[m][n];
			for (int i = 0; i < k; i++) {
				map[sc.nextInt()][sc.nextInt()] = true;
			}

			int cnt = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j]) {
						cnt++;
						adjacent(map, i, j);
					}
				}
			}
			System.out.println(cnt);
		}

	}

	private void adjacent(boolean[][] map, int i, int j) {
		if (map[i][j]) map[i][j] = false;
		if (i > 0 && map[i - 1][j]) adjacent(map, i - 1, j);
		if (j > 0 && map[i][j - 1]) adjacent(map, i, j - 1);
		if (i < map.length - 1 && map[i + 1][j]) adjacent(map, i + 1, j);
		if (j < map[i].length - 1 && map[i][j + 1]) adjacent(map, i, j + 1);
	}

	public static void main(String[] args) {
		new P1012___OrganicCabbage().solve();
	}
}
