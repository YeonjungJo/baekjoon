package baekjoon.solve;
import java.util.Scanner;

public class P10474___DoYouLikeFraction {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) return;

			System.out.printf("%d %d / %d\n", a / b, a % b, b);
		}
	}

	public static void main(String[] args) {
		new P10474___DoYouLikeFraction().solve();
	}
}
