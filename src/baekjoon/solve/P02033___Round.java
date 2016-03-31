package baekjoon.solve;
import java.util.Scanner;

public class P02033___Round {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		for (int i = 1; i <= Math.log10(n); i++) {
			if (n > Math.pow(10, i)) n = round(n, i);
		}
		System.out.println(n);
	}

	private int round(int n, int i) {
		return (int) (Math.round(n / Math.pow(10, i)) * Math.pow(10, i));
	}

	public static void main(String[] args) {
		new P02033___Round().solve();
	}
}
