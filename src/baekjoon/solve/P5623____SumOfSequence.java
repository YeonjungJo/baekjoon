package baekjoon.solve;
import java.util.Scanner;

public class P5623____SumOfSequence {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] data = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				data[i][j] = sc.nextInt();
			}
		}

		int[] result = new int[n];

		if (n == 2) {
			System.out.println("1 " + (data[0][1] - 1));
			return;
		}

		result[0] = ((data[1][0] + data[2][0] + data[2][1]) / 2) - data[2][1];
		for (int i = 1; i < n; i++) {
			result[i] = data[i][0] - result[0];
		}

		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		new P5623____SumOfSequence().solve();
	}
}
