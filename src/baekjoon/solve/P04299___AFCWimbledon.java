package baekjoon.solve;
import java.util.Scanner;

public class P04299___AFCWimbledon {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int sum = sc.nextInt();
		int dif = sc.nextInt();

		if (sum < dif) {
			System.out.println(-1);
			return;
		}

		double max = (sum + dif) / 2.0;
		if ((int) max != max) {
			System.out.println(-1);
			return;
		}
		System.out.printf("%d %d", (int) max, (int) (sum - max));
	}

	public static void main(String[] args) {
		new P04299___AFCWimbledon().solve();
	}
}
