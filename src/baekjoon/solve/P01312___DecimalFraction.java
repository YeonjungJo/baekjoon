package baekjoon.solve;
import java.util.Scanner;

public class P01312___DecimalFraction {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();

		a = a % b;
		for (int i = 0; i < n - 1; i++) {
			a = (a * 10) % b;
		}

		System.out.println((a * 10) / b);
	}

	public static void main(String[] args) {
		new P01312___DecimalFraction().solve();
	}
}
