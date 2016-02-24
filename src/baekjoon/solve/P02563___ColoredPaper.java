package baekjoon.solve;
import java.util.Scanner;

public class P02563___ColoredPaper {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		boolean[][] covered = new boolean[101][101];

		int n = sc.nextInt();
		for (int t = 0; t < n; t++) {
			int b = sc.nextInt();
			int a = sc.nextInt();
			for (int i = a; i < a + 10; i++) {
				for (int j = b; j < b + 10; j++) {
					covered[i][j] = true;
				}
			}
		}

		int area = 0;
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (covered[i][j]) area++;
			}
		}
		System.out.println(area);
	}

	public static void main(String[] args) {
		new P02563___ColoredPaper().solve();
	}
}
