package baekjoon.todo;
import java.util.Scanner;

public class T1028___DiamondMine {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		boolean[][] mine = new boolean[r][c];

		for (int i = 0; i < r; i++) {
			String tmp = sc.next();
			for (int j = 0; j < c; j++) {
				if (tmp.charAt(j) == '1') mine[i][j] = true;
			}
		}

		int size = r > c ? c : r;
		while (size > 0) {
			if (findDiamond(mine, size)) break;
			size--;
		}
		System.out.println(size);
	}

	private boolean findDiamond(boolean[][] mine, int size) {
		for (int i = 0; i < mine.length; i++) {
			for (int j = 0; j < mine[i].length; j++) {
				if (mine[i][j] && isDiamond(mine, size, i, j)) return true;
			}
		}
		return false;
	}

	private boolean isDiamond(boolean[][] mine, int size, int i, int j) {
		if (i + size > mine.length || j + size > mine[0].length) return false;
		for (int n = 0; n < size; n++) {
			if (!mine[i + n][j] || !mine[i + n][j + size - 1] || !mine[i][j + n] || !mine[i + size - 1][j + n]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new T1028___DiamondMine().solve();
	}
}
