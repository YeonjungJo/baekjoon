package baekjoon.solve;
import java.util.Scanner;

public class P01855___Password {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		String s = sc.next();
		int m = s.length() / n;
		char[][] d = new char[m][n];

		int idx = 0;
		for (int i = 0; i < m; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++, idx++) {
					d[i][j] = s.charAt(idx);
				}
			} else {
				for (int j = n - 1; j >= 0; j--, idx++) {
					d[i][j] = s.charAt(idx);
				}
			}
		}

		StringBuilder strBuilder = new StringBuilder();
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				strBuilder.append(d[i][j]);
			}
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P01855___Password().solve();
	}
}
