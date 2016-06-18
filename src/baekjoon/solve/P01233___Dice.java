package baekjoon.solve;
import java.util.Scanner;

public class P01233___Dice {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] r = new int[a + b + c + 1];
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					r[i + j + k]++;
				}
			}
		}

		int max = 1;
		int idx = 3;
		for (int i = 3; i <= a + b + c; i++) {
			if (max < r[i]) {
				max = r[i];
				idx = i;
			}
		}

		System.out.println(idx);
	}

	public static void main(String[] args) {
		new P01233___Dice().solve();
	}
}
