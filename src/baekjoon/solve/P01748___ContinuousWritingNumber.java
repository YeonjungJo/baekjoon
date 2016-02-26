package baekjoon.solve;
import java.util.Scanner;

public class P01748___ContinuousWritingNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		long result = 0;
		for (int i = 0; i <= Math.log10(n) - 1; i++) {
			result += 9 * Math.pow(10, i) * (i + 1);
		}
		result += ((int) Math.log10(n) + 1) * (n - Math.pow(10, (int) Math.log10(n)) + 1);
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P01748___ContinuousWritingNumber().solve();
	}
}
