package baekjoon.solve;
import java.util.Scanner;

public class P6131____PerfectSquareNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int count = 0;
		for (int b = 1; b <= 500; b++) {
			double a = Math.sqrt(b * b + n);
			if (a == (int) a && a <= 500 && a >= b) count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new P6131____PerfectSquareNumber().solve();
	}
}
