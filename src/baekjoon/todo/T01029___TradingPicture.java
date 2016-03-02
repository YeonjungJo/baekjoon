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

		int[][] d = new int[n][n];
		boolean[] v = new boolean[n];
		search(d, v, info, 0, 0, 0);
		System.out.println(d[0][0]);
	}

	private int search(int[][] d, boolean[] v, int[][] info, int i, int j, int cost) {
		if (i > d.length || j > d.length || i < 0 || j < 0) return 0;
		v[i] = true;
		int max = 0;
		for (int t = 0; t < d.length; t++) {
			boolean[] visit = Arrays.copyOf(v, v.length);
			if (t != j && !v[t] && info[j][t] >= cost) {
				search(d, visit, info, j, t, info[j][t]);
				if (d[j][t] > max) max = d[j][t];
			}
		}
		// System.out.printf("%d, %d : %d\n", i, j, 1 + max);
		return d[i][j] = 1 + max;
	}

	public static void main(String[] args) {
		new T01029___TradingPicture().solve();
	}
}
