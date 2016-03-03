package baekjoon.solve;
import java.util.Scanner;

public class P01058___Friend {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		boolean[][][] d = new boolean[n][n][2];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < n; j++) {
				d[i][j][0] = d[j][i][0] = s.charAt(j) == 'Y' ? true : false;
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			int tmp = search(d, i);
			if(tmp > max) max = tmp;
		}

		System.out.println(max);
	}

	private int search(boolean[][][] d, int k) {
		for (int i = 0; i < d.length; i++) {
			if (d[k][i][0]) {
				for (int j = 0; j < d.length; j++) {
					if (j != k && d[i][j][0]) d[k][j][1] = true;
				}
			}
		}

		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[k][i][0] || d[k][i][1]) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		new P01058___Friend().solve();
	}
}
