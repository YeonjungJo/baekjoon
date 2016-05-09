package baekjoon.solve;
import java.math.BigDecimal;
import java.util.Scanner;

public class P12021___TreasureHunt {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();

		while (true) {
			BigDecimal tmpA = nextA(a, b);
			BigDecimal tmpB = nextB(a, b);

			if (tmpA.equals(a) && tmpB.equals(b)) {
				System.out.printf("%s %s", tmpA.setScale(4, BigDecimal.ROUND_HALF_UP), tmpB.setScale(4, BigDecimal.ROUND_HALF_UP));
				return;
			}

			a = tmpA;
			b = tmpB;
		}
	}

	private BigDecimal nextA(BigDecimal a, BigDecimal b) {
		return a.add(b).divide(BigDecimal.valueOf(2)).setScale(7, BigDecimal.ROUND_HALF_UP);
	}

	private BigDecimal nextB(BigDecimal a, BigDecimal b) {
		return BigDecimal.valueOf(2).multiply(a).multiply(b).divide(a.add(b), 7, BigDecimal.ROUND_HALF_UP);
	}

	public static void main(String[] args) {
		new P12021___TreasureHunt().solve();
	}
}
