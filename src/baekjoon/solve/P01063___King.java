package baekjoon.solve;
import java.util.Scanner;

public class P01063___King {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "ABCDEFGH";

	private static final int[] GO_X = { 1, -1, 0, 0, 1, -1, 1, -1 };
	private static final int[] GO_Y = { 0, 0, -1, 1, 1, 1, -1, -1 };

	private void solve() {
		int[] king = getLocation(sc.next());
		int[] stone = getLocation(sc.next());

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			go(king, stone, sc.next());
		}

		System.out.println(reverse(king));
		System.out.println(reverse(stone));
	}

	private String reverse(int[] l) {
		return ALPHABET.charAt(l[0]) + "" + (l[1] + 1);
	}

	private void go(int[] king, int[] stone, String next) {
		int dir = getDir(next);
		int x = king[0] + GO_X[dir];
		int y = king[1] + GO_Y[dir];
		if (x >= 8 || y >= 8 || x < 0 || y < 0) return;
		if (x == stone[0] && y == stone[1]) {
			int sx = stone[0] + GO_X[dir];
			int sy = stone[1] + GO_Y[dir];
			if (sx >= 8 || sy >= 8 || sx < 0 || sy < 0) return;
			stone[0] = sx;
			stone[1] = sy;
		}
		king[0] = x;
		king[1] = y;
	}

	private int getDir(String next) {
		switch (next) {
		case "R":
			return 0;
		case "L":
			return 1;
		case "B":
			return 2;
		case "T":
			return 3;
		case "RT":
			return 4;
		case "LT":
			return 5;
		case "RB":
			return 6;
		case "LB":
			return 7;
		}
		return -1;
	}

	private int[] getLocation(String s) {
		int[] loc = new int[2];
		loc[0] = ALPHABET.indexOf(s.charAt(0));
		loc[1] = Character.getNumericValue(s.charAt(1)) - 1;
		return loc;
	}

	public static void main(String[] args) {
		new P01063___King().solve();
	}
}
