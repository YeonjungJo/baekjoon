package baekjoon.day20160112;
import java.util.Scanner;

public class p2167_sum2DimArray {

	private void init() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int[] index = new int[4];
			for (int j = 0; j < 4; j++) {
				index[j] = sc.nextInt() - 1;
			}
			System.out.println(operate(array, index));
		}
	}

	private int operate(int[][] array, int[] index) {
		int sum = 0;
		for (int i = index[0]; i <= index[2]; i++) {
			for (int j = index[1]; j <= index[3]; j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		new p2167_sum2DimArray().init();
	}
}