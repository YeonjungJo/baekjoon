package baekjoon.solve;
import java.util.Scanner;

public class P04619___Root {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int b = sc.nextInt();
			int n = sc.nextInt();
			if (b == 0 && n == 0) return;
			int a = (int) Math.pow(10, Math.log10(b) / n);
			System.out.println(Math.abs(b - Math.pow(a, n)) < Math.abs(b - Math.pow(a + 1, n)) ? a : a + 1);
		}
	}

	public static void main(String[] args) {
		new P04619___Root().solve();
	}
}
