package baekjoon.solve;
import java.util.Scanner;

public class P11586___MagicMirror {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		char[][] mirror = new char[n][n];
		for (int i = 0; i < n; i++) {
			mirror[i] = sc.next().toCharArray();
		}
		int state = sc.nextInt();

		if (state == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mirror[i][j]);
				}
				System.out.println();
			}
		}
		if (state == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mirror[i][n - j - 1]);
				}
				System.out.println();
			}
		}
		if (state == 3) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mirror[n - i - 1][j]);
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		new P11586___MagicMirror().solve();
	}
}
