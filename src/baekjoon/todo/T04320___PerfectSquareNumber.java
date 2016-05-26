package baekjoon.todo;
import java.util.Scanner;

public class T04320___PerfectSquareNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int x = sc.nextInt();
			if (x == 0) return;

			findP(x);
		}
	}

	private void findP(int x) {
		double absx = Math.abs(x);
		double logx = Math.log(absx);

		for (int b = 2; b <= Math.sqrt(absx); b++) {
			double logb = Math.log(b);
			double p = logx / logb;
			if (x == Math.pow(b, p)) {
				if (p % 2 == 1 || x > 0) {
					System.out.println((int) p);
					return;
				}
			}
		}

		System.out.println(1);
	}

	public static void main(String[] args) {
		new T04320___PerfectSquareNumber().solve();
	}
}