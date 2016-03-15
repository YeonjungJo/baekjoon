package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P02865___SuperstarK {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		float[] score = new float[n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int t = sc.nextInt() - 1;
				float s = sc.nextFloat();
				if (score[t] < s) score[t] = s;
			}
		}

		Arrays.sort(score);
		float sum = 0;
		for (int i = n - k; i < n; i++) {
			sum += score[i];
		}

		System.out.printf("%.1f", sum);
	}

	public static void main(String[] args) {
		new P02865___SuperstarK().solve();
	}
}
