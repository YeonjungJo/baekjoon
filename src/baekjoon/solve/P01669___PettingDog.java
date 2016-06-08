package baekjoon.solve;
import java.util.Scanner;

public class P01669___PettingDog {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int m = sc.nextInt();
		int d = sc.nextInt();
		int k = d - m;

		if (k == 0) {
			System.out.println(0);
			return;
		}

		for (int i = 1;; i++) {
			for (int j = 1; j <= 2; j++) {
				k -= i;
				if (k <= 0) {
					System.out.println(2 * (i - 1) + j);
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		new P01669___PettingDog().solve();
	}
}
