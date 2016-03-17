package baekjoon.solve;
import java.util.Scanner;

public class P02072___Omok {

	private static final Scanner sc = new Scanner(System.in);

	private static final int B = 1;
	private static final int W = 2;

	private void solve() {
		int n = sc.nextInt();
		int[][] d = new int[20][20];
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			d[a][b] = i % 2 == 0 ? W : B;
			if (check(d, a, b, i % 2 == 0 ? W : B)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

	private boolean check(int[][] d, int a, int b, int color) {
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		for (int i = -5; i <= 5; i++) {
			if (count(d, 0, a, b, i, color)) countA++;
			else if (countA == 5) return true;
			else countA = 0;
			if (count(d, 1, a, b, i, color)) countB++;
			else if (countB == 5) return true;
			else countB = 0;
			if (count(d, 2, a, b, i, color)) countC++;
			else if (countC == 5) return true;
			else countC = 0;
			if (count(d, 3, a, b, i, color)) countD++;
			else if (countD == 5) return true;
			else countD = 0;
		}
		return false;
	}

	private boolean count(int[][] d, int dir, int a, int b, int i, int color) {
		switch (dir) {
		case 0:
			a += i;
			break;
		case 1:
			b += i;
			break;
		case 2:
			a += i;
			b += i;
			break;
		case 3:
			a += i;
			b -= i;
			break;
		}
		if (a < 0 || a >= d.length || b < 0 || b >= d.length || d[a][b] != color) return false;
		return true;
	}

	public static void main(String[] args) {
		new P02072___Omok().solve();
	}
}
