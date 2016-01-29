package baekjoon.day20160122;
import java.util.Scanner;

public class P1004___LittlePrince {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int ex = sc.nextInt();
			int ey = sc.nextInt();

			int n = sc.nextInt();
			int cnt = 0;

			for (int j = 0; j < n; j++) {
				if (mustPass(sx, sy, ex, ey, sc.nextInt(), sc.nextInt(), sc.nextInt())) {
					cnt++;
				}
			}

			System.out.println(cnt);
		}
	}

	private boolean mustPass(int sx, int sy, int ex, int ey, int x, int y, int r) {
		return isInside(sx, sy, x, y, r) ^ isInside(ex, ey, x, y, r);
	}

	private boolean isInside(int px, int py, int x, int y, int r) {
		if (Math.pow(px - x, 2) + Math.pow(py - y, 2) < Math.pow(r, 2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		new P1004___LittlePrince().solve();
	}
}
