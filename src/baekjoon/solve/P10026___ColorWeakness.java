package baekjoon.solve;
import java.util.Scanner;

public class P10026___ColorWeakness {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		char[][] normal = new char[n][n];
		char[][] weakness = new char[n][n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			normal[i] = s.toCharArray();
			weakness[i] = s.toCharArray();
		}

		int b = count(normal, 'B', ' ');
		int nCount = b;
		int wCount = b;

		nCount += count(normal, 'R', ' ');
		nCount += count(normal, 'G', ' ');
		wCount += count(weakness, 'R', 'G');

		System.out.println(nCount + " " + wCount);
	}

	private int count(char[][] paint, char a, char b) {
		int result = 0;
		for (int i = 0; i < paint.length; i++) {
			for (int j = 0; j < paint.length; j++) {
				if (paint[i][j] == a || paint[i][j] == b) {
					result++;
					search(paint, i, j, a, b);
				}
			}
		}
		return result;
	}

	private void search(char[][] paint, int i, int j, char a, char b) {
		if (i < 0 || j < 0 || i >= paint.length || j >= paint.length) return;
		if (paint[i][j] == 'x' || (paint[i][j] != a && paint[i][j] != b)) return;
		paint[i][j] = 'x';
		search(paint, i, j - 1, a, b);
		search(paint, i, j + 1, a, b);
		search(paint, i - 1, j, a, b);
		search(paint, i + 1, j, a, b);
	}

	public static void main(String[] args) {
		new P10026___ColorWeakness().solve();
	}
}
