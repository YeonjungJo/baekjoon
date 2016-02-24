package baekjoon.solve;
import java.util.Scanner;

public class P04564___NumberingCardGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			String s = sc.next();
			if (s.equals("0")) return;
			System.out.print(s + " ");
			while (s.length() > 1) {
				char[] a = s.toCharArray();
				int tmp = 1;
				for (int i = 0; i < a.length; i++) {
					tmp *= Character.getNumericValue(a[i]);
				}
				s = Integer.toString(tmp);
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P04564___NumberingCardGame().solve();
	}
}
