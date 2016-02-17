package baekjoon.solve;
import java.util.Scanner;

public class P02669___SumOfArea {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {

		boolean[][] data = new boolean[101][101];

		for (int k = 0; k < 4; k++) {
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int ex = sc.nextInt();
			int ey = sc.nextInt();

			for (int i = sx; i < ex; i++) {
				for (int j = sy; j < ey; j++) {
					data[i][j] = true;
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (data[i][j]) cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new P02669___SumOfArea().solve();
	}
}
