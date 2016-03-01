package baekjoon.solve;
import java.util.Scanner;

public class P01018___RepaintChessboard {

	private static final Scanner sc = new Scanner(System.in);

	private static final String w = "WBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBW";
	private static final String b = "BWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWB";

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] chess = new char[n][m];
		for (int i = 0; i < n; i++)
			chess[i] = sc.next().toCharArray();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int wcount = search(chess, i, j, w);
				int bcount = search(chess, i, j, b);
				if (wcount < min) min = wcount;
				if (bcount < min) min = bcount;
			}
		}

		System.out.println(min);
	}

	private int search(char[][] chess, int a, int b, String s) {
		int count = 0;
		int tmp = 0;
		for (int i = a; i < a + 8; i++) {
			for (int j = b; j < b + 8; j++) {
				if (s.charAt(tmp) != chess[i][j]) count++;
				tmp++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		new P01018___RepaintChessboard().solve();
	}
}
