package baekjoon.todo;

import java.util.Arrays;
import java.util.Scanner;

public class T01029___TradingPicture {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] info = new int[n][n];
		for (int i = 0; i < n; i++) {
			char[] tmp = sc.next().toCharArray();
			for (int j = 0; j < n; j++) {
				info[i][j] = Character.getNumericValue(tmp[j]);
			}
		}

		boolean[] d = new boolean[n];
		System.out.println(search(d, info, n, 0, 0));
	}

	private int search(boolean[] d, int[][] info, int n, int owner, int before) {
		d[owner] = true;

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (!d[i] && info[owner][i] >= before) {
				boolean[] v = Arrays.copyOf(d, n);
				int tmp = search(v, info, n, i, info[owner][i]);
				if (tmp > max) max = tmp;
			}
		}
		return max + 1;
	}

	public static void main(String[] args) {
		new T01029___TradingPicture().solve();
	}
}