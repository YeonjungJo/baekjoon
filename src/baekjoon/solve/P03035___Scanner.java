package baekjoon.solve;
import java.util.Scanner;

public class P03035___Scanner {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int r = sc.nextInt();
		int c = sc.nextInt();
		int zr = sc.nextInt();
		int zc = sc.nextInt();

		char[][] a = new char[r][c];
		for (int i = 0; i < r; i++) {
			a[i] = sc.next().toCharArray();
		}

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < r * zr; i++) {
			for (int j = 0; j < c * zc; j++) {
				strBuilder.append(a[i / zr][j / zc]);
			}
			strBuilder.append("\n");
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P03035___Scanner().solve();
	}
}
