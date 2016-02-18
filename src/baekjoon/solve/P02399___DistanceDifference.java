package baekjoon.solve;
import java.util.Scanner;

public class P02399___DistanceDifference {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		long result = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				result += Math.abs(p[i] - p[j]);
			}
		}

		System.out.println(result * 2);
	}

	public static void main(String[] args) {
		new P02399___DistanceDifference().solve();
	}
}
