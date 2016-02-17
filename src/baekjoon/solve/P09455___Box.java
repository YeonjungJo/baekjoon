package baekjoon.solve;
import java.util.Scanner;

public class P09455___Box {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			boolean[][] block = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (sc.nextInt() == 1) block[i][j] = true;
				}
			}
			System.out.println(findDistance(block));
		}
	}

	private int findDistance(boolean[][] block) {
		int distance = 0;
		for (int j = 0; j < block[0].length; j++) {
			int tmp = 0;
			for (int i = block.length - 1; i >= 0; i--) {
				if (block[i][j]) {
					distance += tmp;
				} else tmp++;
			}
		}
		return distance;
	}

	public static void main(String[] args) {
		new P09455___Box().solve();
	}
}
