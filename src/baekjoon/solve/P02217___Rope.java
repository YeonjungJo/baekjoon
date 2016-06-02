package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P02217___Rope {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] rope = new int[n];
		for (int i = 0; i < n; i++) {
			rope[i] = sc.nextInt();
		}
		Arrays.sort(rope);

		int max = rope[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (max < rope[i] * (n - i)) max = rope[i] * (n - i);
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		new P02217___Rope().solve();
	}
}
