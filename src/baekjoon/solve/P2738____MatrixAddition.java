package baekjoon.solve;
import java.util.Scanner;

public class P2738____MatrixAddition {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] += sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P2738____MatrixAddition().solve();
	}
}
