package baekjoon.solve;
import java.util.Scanner;

public class P02897___MonsterTruck {

	private static final Scanner sc = new Scanner(System.in);

	private static final char BUILDING = '#';
	private static final char PARKED = 'X';

	private static final int IMPOSSIBLE = -1;

	private void solve() {
		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] parkingArea = new int[r][c - 1];
		for (int i = 0; i < r; i++) {
			String s = sc.next();
			char a = s.charAt(0);
			for (int j = 1; j < c; j++) {
				char tmp = s.charAt(j);
				if (a == BUILDING || tmp == BUILDING) parkingArea[i][j - 1] = IMPOSSIBLE;
				else {
					if (a == PARKED) parkingArea[i][j - 1]++;
					if (tmp == PARKED) parkingArea[i][j - 1]++;
				}
				a = tmp;
			}
		}

		int[] destory = new int[5];
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < c - 1; j++) {
				if (parkingArea[i][j] == IMPOSSIBLE || parkingArea[i + 1][j] == IMPOSSIBLE) continue;
				destory[parkingArea[i][j] + parkingArea[i + 1][j]]++;
			}
		}

		for (int i = 0; i < destory.length; i++) {
			System.out.println(destory[i]);
		}
	}

	public static void main(String[] args) {
		new P02897___MonsterTruck().solve();
	}
}
