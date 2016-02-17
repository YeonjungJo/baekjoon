package baekjoon.solve;
import java.util.Scanner;

public class P02914___Copyright {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int avg = sc.nextInt();

		System.out.println(n * (avg - 1) + 1);
	}

	public static void main(String[] args) {
		new P02914___Copyright().solve();
	}
}
