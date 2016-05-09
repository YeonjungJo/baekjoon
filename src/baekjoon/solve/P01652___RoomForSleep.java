package baekjoon.solve;
import java.util.Scanner;

public class P01652___RoomForSleep {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		boolean[][] d = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < n; j++) {
				d[i][j] = s.charAt(j) == '.' ? true : false;
			}
		}

		int h = 0;
		int v = 0;

		int tmph = 0;
		int tmpv = 0;
		for (int i = 0; i < n; i++) {
			tmph = 0;
			tmpv = 0;
			for (int j = 0; j < n; j++) {
				if (d[i][j]) tmph++;
				else {
					if (tmph > 1) h++;
					tmph = 0;
				}

				if (d[j][i]) tmpv++;
				else {
					if (tmpv > 1) v++;
					tmpv = 0;
				}
			}
			h += tmph > 1 ? 1 : 0;
			v += tmpv > 1 ? 1 : 0;
		}

		System.out.println(h + " " + v);
	}

	public static void main(String[] args) {
		new P01652___RoomForSleep().solve();
	}
}