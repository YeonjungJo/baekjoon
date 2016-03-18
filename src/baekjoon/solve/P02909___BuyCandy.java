package baekjoon.solve;
import java.util.Scanner;

public class P02909___BuyCandy {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int c = sc.nextInt();
		int k = sc.nextInt();

		System.out.println((int) (Math.round(c / Math.pow(10, k)) * Math.pow(10, k)));
	}

	public static void main(String[] args) {
		new P02909___BuyCandy().solve();
	}
}
