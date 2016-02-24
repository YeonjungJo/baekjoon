package baekjoon.solve;
import java.util.Scanner;

public class P02578___Bingo {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[][] map = new int[5][5];
		boolean[][] bingo = new boolean[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for (int t = 1; t <= 25; t++) {
			int number = sc.nextInt();
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (map[i][j] == number) {
						bingo[i][j] = true;
					}
				}
			}
			// System.out.printf("%d : %d, bingo : %d\n", t, number,
			if (checkBingo(bingo) >= 3) {
				System.out.println(t);
				return;
			}
		}
	}

	private int checkBingo(boolean[][] bingo) {
		int count = 0;
		boolean tmp = false;

		for (int i = 0; i < 5; i++) {
			tmp = true;
			for (int j = 0; j < 5; j++) {
				if (!bingo[i][j]) {
					tmp = false;
					break;
				}
			}
			if (tmp) {
				count++;
			}
		}
		for (int i = 0; i < 5; i++) {
			tmp = true;
			for (int j = 0; j < 5; j++) {
				if (!bingo[j][i]) {
					tmp = false;
					break;
				}
			}
			if (tmp) {
				count++;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (!bingo[i][i]) break;
			if (i == 4) count++;
		}
		for (int i = 0; i < 5; i++) {
			if (!bingo[4 - i][i]) break;
			if (i == 4) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		new P02578___Bingo().solve();
	}
}
