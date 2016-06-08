package baekjoon.solve;
import java.util.Scanner;

public class P01563___AttendanceAward {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[][][] d = new int[n + 1][2][3];
		System.out.println(search(d, n, 0, 0, 0));
	}

	private int search(int[][][] d, int n, int i, int late, int absense) {
		if (late >= 2 || absense >= 3) return 0;
		if (d[i][late][absense] != 0) return d[i][late][absense];
		if (i == n) return 1;

		int result = 0;
		result += search(d, n, i + 1, late, 0);
		result += search(d, n, i + 1, late + 1, 0);
		result += search(d, n, i + 1, late, absense + 1);
		return d[i][late][absense] = result % 1000000;
	}

	public static void main(String[] args) {
		new P01563___AttendanceAward().solve();
	}
}
