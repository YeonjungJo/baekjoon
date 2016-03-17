package baekjoon.solve;
import java.util.Scanner;

public class P03063___Board {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();

			int area = (x2 - x1) * (y2 - y1);

			if (x4 < x1 || x3 > x2 || y4 < y1 || y3 > y2) {
				System.out.println(area);
				break;
			}
			int ox = 0;
			int oy = 0;
			if (x1 >= x3) {
				ox = min(x2, x4) - x1;
			}
			if (x1 < x3) {
				ox = min(x2, x4) - x3;
			}
			if (y1 >= y3) {
				oy = min(y2, y4) - y1;
			}
			if (y1 < y3) {
				oy = min(y2, y4) - y3;
			}

			System.out.println(area - (ox * oy));
		}
	}

	private int min(int x, int y) {
		return x < y ? x : y;
	}

	public static void main(String[] args) {
		new P03063___Board().solve();
	}
}
