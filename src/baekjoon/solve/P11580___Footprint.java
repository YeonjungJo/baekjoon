package baekjoon.solve;
import java.util.Scanner;

public class P11580___Footprint {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int l = sc.nextInt();
		char[] order = sc.next().toCharArray();

		boolean[][] d = new boolean[2001][2001];
		d[1000][1000] = true;

		int x = 1000;
		int y = 1000;
		for (int i = 0; i < l; i++) {
			switch (order[i]) {
			case 'E':
				x++;
				break;
			case 'W':
				x--;
				break;
			case 'S':
				y--;
				break;
			case 'N':
				y++;
				break;
			}
			d[x][y] = true;
		}

		int count = 0;
		for (int i = 0; i < 2001; i++) {
			for (int j = 0; j < 2001; j++) {
				if (d[i][j]) count++;
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new P11580___Footprint().solve();
	}
}
