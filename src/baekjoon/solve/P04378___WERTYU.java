package baekjoon.solve;
import java.util.Scanner;

public class P04378___WERTYU {

	private static final Scanner sc = new Scanner(System.in);

	private static final String KEYBOARD = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

	private void solve() {
		while (sc.hasNextLine()) {
			String[] s = sc.nextLine().split(" ");
			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < s[i].length(); j++) {
					System.out.print(KEYBOARD.charAt(KEYBOARD.indexOf(s[i].charAt(j)) - 1));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P04378___WERTYU().solve();
	}
}