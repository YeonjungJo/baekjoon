package baekjoon.solve;
import java.util.Scanner;

public class P02712___AmericanStyle {

	private static final Scanner sc = new Scanner(System.in);

	enum UNIT {
		kg, lb, l, g
	}

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			double n = sc.nextDouble();
			UNIT u = UNIT.valueOf(sc.next());
			trans(n, u);
		}
	}

	private void trans(double n, UNIT u) {
		switch (u) {
		case g:
			System.out.println(get(n * 3.7854) + " l");
			return;
		case kg:
			System.out.println(get(n * 2.2046) + " lb");
			return;
		case l:
			System.out.println(get(n * 0.2642) + " g");
			return;
		case lb:
			System.out.println(get(n * 0.4536) + " kg");
			return;
		}
	}

	private String get(double d) {
		return String.format("%.4f", (double) Math.round(d * 10000) / 10000);
	}

	public static void main(String[] args) {
		new P02712___AmericanStyle().solve();
	}
}
