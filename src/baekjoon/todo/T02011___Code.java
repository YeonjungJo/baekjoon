package baekjoon.todo;
import java.util.Scanner;

public class T02011___Code {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.nextLine();
		int[][] d = new int[s.length() + 1][3];

		System.out.println((search(d, s, 0, 1) + search(d, s, 0, 2)) % 1000000);
	}

	private int search(int[][] d, String s, int i, int j) {
		if (i + j > s.length()) return 0;
		if (d[i][j] != 0) return d[i][j];
		int tmp = Integer.parseInt(s.substring(i, i + j));
		if (tmp > 26 || tmp < 1) return 0;
		if (i + j == s.length()) return 1;

		return d[i][j] = (search(d, s, i + j, 1) + search(d, s, i + j, 2)) % 1000000;
	}

	public static void main(String[] args) {
		new T02011___Code().solve();
	}
}
