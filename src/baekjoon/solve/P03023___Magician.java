package baekjoon.solve;
import java.util.Scanner;

public class P03023___Magician {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] card = new char[2 * r][2 * c];
		for (int i = 0; i < r; i++) {
			String s = sc.next();
			for (int j = 0; j < c; j++) {
				card[i][j] = s.charAt(j);
				card[2 * r - i - 1][j] = s.charAt(j);
				card[i][2 * c - j - 1] = s.charAt(j);
				card[2 * r - i - 1][2 * c - j - 1] = s.charAt(j);
			}
		}

		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		if (card[a][b] == '.') card[a][b] = '#';
		else card[a][b] = '.';

		for (int i = 0; i < 2 * r; i++) {
			for (int j = 0; j < 2 * c; j++) {
				System.out.print(card[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P03023___Magician().solve();
	}
}
