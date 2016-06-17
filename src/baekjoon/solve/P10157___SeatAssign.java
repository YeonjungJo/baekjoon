package baekjoon.solve;
import java.util.Scanner;

public class P10157___SeatAssign {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		if (n * m < k) {
			System.out.println(0);
			return;
		}

		int x = 1;
		int y = 1;
		int d = 0;

		boolean[][] v = new boolean[n][m];

		for (int i = 1; i < k; i++) {
			switch (d) {
			case 0:
				v[x - 1][y - 1] = true;
				y++;
				if (y > m || v[x - 1][y - 1]) {
					y--;
					x++;
					d = 1;
				}
				break;
			case 1:
				v[x - 1][y - 1] = true;
				x++;
				if (x > n || v[x - 1][y - 1]) {
					x--;
					y--;
					d = 2;
				}
				break;
			case 2:
				v[x - 1][y - 1] = true;
				y--;
				if (y < 1 || v[x - 1][y - 1]) {
					y++;
					x--;
					d = 3;
				}
				break;
			case 3:
				v[x - 1][y - 1] = true;
				x--;
				if (x < 1 || v[x - 1][y - 1]) {
					x++;
					y++;
					d = 0;
				}
				break;
			}
		}

		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		new P10157___SeatAssign().solve();
	}
}
