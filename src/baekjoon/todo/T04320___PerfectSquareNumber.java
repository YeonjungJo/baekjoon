package baekjoon.todo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class T04320___PerfectSquareNumber {

	/*
	 * Double로 계산하면 부동소수점때문에 125 --> 3.000000004 나옴 그래서 BigDecimal로 풀었는데 왜
	 * 런타임에러?
	 */

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int x = sc.nextInt();
			if (x == 0) return;

			System.out.println(findP(x));
		}
	}

	private int findP(int x) {
		if (x > 0) {
			BigDecimal logx = new BigDecimal(Double.toString(Math.log(x)));
			for (int b = 2; b <= Math.sqrt(x); b++) {
				BigDecimal logb = new BigDecimal(Double.toString(Math.log(b)));
				BigDecimal p = logx.divide(logb, 5, RoundingMode.HALF_UP);
				if (p.doubleValue() == p.intValue()) return p.intValue();
			}
		} else {
			x *= -1;
			BigDecimal logx = BigDecimal.valueOf(Math.log(x));
			for (int b = 2; b <= Math.sqrt(x); b++) {
				BigDecimal logb = new BigDecimal(Double.toString(Math.log(b)));
				BigDecimal p = logx.divide(logb, 5, RoundingMode.HALF_UP);
				if (p.doubleValue() == p.intValue() && p.intValue() % 2 != 0) return p.intValue();
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		new T04320___PerfectSquareNumber().solve();
	}
}