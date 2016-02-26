package baekjoon.solve;
import java.util.Scanner;

public class P01149___RGBDistance {

	private static final Scanner sc = new Scanner(System.in);

	private static final int R = 0;
	private static final int G = 1;
	private static final int B = 2;

	private void solve() {
		int n = sc.nextInt();
		int[][] rgb = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				rgb[i][j] = sc.nextInt();
			}
		}

		int[][] d = new int[n][3];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 3; i++) {
			int tmp = getRGB(rgb, d, 0, i);
			min = tmp > min ? min : tmp;
		}
		System.out.println(min);
	}

	private int getRGB(int[][] rgb, int[][] d, int i, int color) {
		if (i == d.length - 1) return rgb[i][color];
		if (color == R) return d[i][R] = rgb[i][R] + min(getRGB(rgb, d, i + 1, G), getRGB(rgb, d, i + 1, B));
		if (color == G) return d[i][G] = rgb[i][G] + min(getRGB(rgb, d, i + 1, R), getRGB(rgb, d, i + 1, B));
		if (color == B) return d[i][B] = rgb[i][B] + min(getRGB(rgb, d, i + 1, R), getRGB(rgb, d, i + 1, G));
		return 0;
	}

	private int min(int i, int j) {
		return i > j ? j : i;
	}

	public static void main(String[] args) {
		new P01149___RGBDistance().solve();
	}
}
