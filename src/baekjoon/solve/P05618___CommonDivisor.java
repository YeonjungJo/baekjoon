package baekjoon.solve;
import java.util.Scanner;

public class P05618___CommonDivisor {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] number = new int[n];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
			if (number[i] < min) min = number[i];
		}

		Loop1: for (int i = 1; i <= min; i++) {
			for (int j = 0; j < n; j++) {
				if (number[j] % i != 0) continue Loop1;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new P05618___CommonDivisor().solve();
	}
}
