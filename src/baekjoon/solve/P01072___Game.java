package baekjoon.solve;
import java.util.Scanner;

public class P01072___Game {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNextInt()) {
			long x = sc.nextInt();
			long y = sc.nextInt();

			long z = ((y * 100) / x) + 1;

			long a = z * x - 100 * y;
			long b = 100 - z;

			search(a, b, z);
		}
	}

	private void search(long a, long b, long z) {
		if (a <= 0 || z >= 100) {
			System.out.println(-1);
		} else {
			long result = a / b;
			if (a % b != 0) result++;
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		new P01072___Game().solve();
	}
}
