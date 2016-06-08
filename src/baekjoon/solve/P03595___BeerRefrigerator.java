package baekjoon.solve;
import java.util.Scanner;

public class P03595___BeerRefrigerator {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] side = new int[3];
		int min = area(1, 1, n);
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n / i; j++) {
				for (int k = j; k <= n / (i * j); k++) {
					if (i * j * k == n) {
						int a = area(i, j, k);
						if (min >= a) {
							min = a;
							int[] tmp = { k, j, i };
							side = tmp;
						}
					}
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(side[i] + " ");
		}
	}

	private int area(int i, int j, int n) {
		return 2 * (i * j + i * n + j * n);
	}

	public static void main(String[] args) {
		new P03595___BeerRefrigerator().solve();
	}
}
