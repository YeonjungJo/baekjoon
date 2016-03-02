package baekjoon.solve;
import java.util.Scanner;

public class P01951___Type {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int t = (int) Math.log10(n);

		long type = 0;
		for (int i = 0; i < t; i++) {
			type += 9 * Math.pow(10, i) * (i + 1) % 1234567;
		}

		type += (n - Math.pow(10, t) + 1) * (t + 1);
		
		System.out.println(type % 1234567);
	}

	public static void main(String[] args) {
		new P01951___Type().solve();
	}
}
