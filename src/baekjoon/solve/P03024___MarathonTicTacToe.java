package baekjoon.solve;
import java.util.Scanner;

public class P03024___MarathonTicTacToe {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		char[][] a = new char[n][n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 2; j++) {
				if (a[i][j] != '.' && a[i][j] == a[i][j + 1] && a[i][j] == a[i][j + 2]) {
					System.out.println(a[i][j]);
					return;
				}
				if (a[j][i] != '.' && a[j][i] == a[j + 1][i] && a[j][i] == a[j + 2][i]) {
					System.out.println(a[j][i]);
					return;
				}
			}
		}

		for (int i = 0; i < n - 2; i++) {
			for (int j = 0; j < n - 2; j++) {
				if (a[i][j] != '.' && a[i][j] == a[i + 1][j + 1] && a[i][j] == a[i + 2][j + 2]) {
					System.out.println(a[i][j]);
					return;
				}
			}
		}

		for (int i = 2; i < n; i++) {
			for (int j = 0; j < n - 2; j++) {
				if (a[i][j] != '.' && a[i][j] == a[i - 1][j + 1] && a[i][j] == a[i - 2][j + 2]) {
					System.out.println(a[i][j]);
					return;
				}
			}
		}
		System.out.println("ongoing");
	}

	public static void main(String[] args) {
		new P03024___MarathonTicTacToe().solve();
	}
}
