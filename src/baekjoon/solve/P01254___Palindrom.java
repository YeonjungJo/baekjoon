package baekjoon.solve;
import java.util.Scanner;

public class P01254___Palindrom {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();

		for (int i = 0; i <= s.length(); i++) {
			String newString = create(s, i);
			if (isPalindrom(newString)) {
				System.out.println(s.length() + i);
				return;
			}
		}
	}

	private boolean isPalindrom(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		return true;
	}

	private String create(String s, int n) {
		StringBuilder strBuilder = new StringBuilder(s);
		for (int i = n - 1; i >= 0; i--) {
			strBuilder.append(s.charAt(i));
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		new P01254___Palindrom().solve();
	}
}
