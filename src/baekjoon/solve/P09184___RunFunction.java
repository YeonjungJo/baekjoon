package baekjoon.solve;
import java.util.Scanner;

public class P09184___RunFunction {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == -1 && b == -1 && c == -1) return;
			int[][][] d = new int[21][21][21];
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, search(d, a, b, c));
		}
	}

	private int search(int[][][] d, int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) return 1;
		if (a > 20 || b > 20 || c > 20) return search(d, 20, 20, 20);
		if (d[a][b][c] != 0) return d[a][b][c];
		return d[a][b][c] = search(d, a - 1, b, c) + search(d, a - 1, b - 1, c) + search(d, a - 1, b, c - 1) - search(d, a - 1, b - 1, c - 1);
	}

	public static void main(String[] args) {
		new P09184___RunFunction().solve();
	}
}