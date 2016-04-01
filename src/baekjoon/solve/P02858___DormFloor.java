package baekjoon.solve;
import java.util.Scanner;

public class P02858___DormFloor {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = m; i >= 1; i--) {
			if (m % i == 0) {
				int j = m / i;
				if (i + j == (n - 4) / 2) {
					System.out.println((i + 2) + " " + (j + 2));
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		new P02858___DormFloor().solve();
	}
}
