package baekjoon.solve;
import java.util.Scanner;

public class P01138___StandingInARow {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		StringBuilder str = new StringBuilder();
		for (int i = n - 1; i >= 0; i--) {
			str.insert(input[i], i);
		}

		for (int i = 0; i < n; i++) {
			System.out.print((Character.getNumericValue(str.charAt(i)) + 1) + " ");
		}
	}

	public static void main(String[] args) {
		new P01138___StandingInARow().solve();
	}
}
