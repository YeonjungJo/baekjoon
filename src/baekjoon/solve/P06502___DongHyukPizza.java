package baekjoon.solve;
import java.util.Scanner;

public class P06502___DongHyukPizza {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		for (int i = 1;; i++) {
			int r = sc.nextInt();
			if (r == 0) return;
			int w = sc.nextInt();
			int l = sc.nextInt();

			if (Math.pow(w, 2) + Math.pow(l, 2) <= Math.pow(2 * r, 2)) {
				System.out.printf("Pizza %d fits on the table.\n", i);
			} else {
				System.out.printf("Pizza %d does not fit on the table.\n", i);
			}
		}
	}

	public static void main(String[] args) {
		new P06502___DongHyukPizza().solve();
	}
}
