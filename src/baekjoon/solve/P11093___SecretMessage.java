package baekjoon.solve;
import java.util.Scanner;

public class P11093___SecretMessage {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			char[] s = sc.next().toCharArray();

			int n = (int) Math.ceil(Math.sqrt(s.length));

			char[][] a = new char[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i * n + j < s.length) a[i][j] = s[i * n + j];
					else a[i][j] = '*';
				}
			}

			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					if (a[j][i] != '*') stringBuilder.append(a[j][i]);
				}
			}

			System.out.println(stringBuilder.toString());
		}
	}

	public static void main(String[] args) {
		new P11093___SecretMessage().solve();
	}
}
