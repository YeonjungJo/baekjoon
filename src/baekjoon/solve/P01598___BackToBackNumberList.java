package baekjoon.solve;
import java.util.Scanner;

public class P01598___BackToBackNumberList {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt() - 1;
		int m = sc.nextInt() - 1;

		System.out.println(Math.abs(n % 4 - m % 4) + Math.abs(n / 4 - m / 4));
	}

	public static void main(String[] args) {
		new P01598___BackToBackNumberList().solve();
	}
}
