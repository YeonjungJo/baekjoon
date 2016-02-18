package baekjoon.solve;
import java.util.Scanner;

public class P02740___MatrixMultiplication {

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

		sc.nextInt();
		int k = sc.nextInt();
		int[][] b = new int[m][k];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(multiply(a, b, i, j) + " ");
			}
			System.out.println();
		}
	}

	private int multiply(int[][] a, int[][] b, int n, int k) {
		int result = 0;

		for (int i = 0; i < a[0].length; i++) {
			result += a[n][i] * b[i][k];
		}
		return result;
	}

	public static void main(String[] args) {
		new P02740___MatrixMultiplication().solve();
	}
}
