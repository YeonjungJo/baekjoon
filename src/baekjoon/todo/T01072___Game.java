package baekjoon.todo;
import java.math.BigDecimal;
import java.util.Scanner;

public class T01072___Game {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			double a = (y / (float) x) * 100;

			int z = (int) a + 1;

			if (z >= 100) {
				System.out.println(-1);
				continue;
			}

			BigDecimal aa = BigDecimal.valueOf(z).multiply(BigDecimal.valueOf(x))
					.subtract(BigDecimal.valueOf(100).multiply(BigDecimal.valueOf(y)));
			BigDecimal ab = BigDecimal.valueOf(100 - z);
			aa = aa.divide(ab, 0, BigDecimal.ROUND_UP);
			System.out.println(aa);
		}
	}

	public static void main(String[] args) {
		new T01072___Game().solve();
	}
}
