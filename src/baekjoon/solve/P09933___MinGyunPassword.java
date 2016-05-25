package baekjoon.solve;
import java.util.Scanner;

public class P09933___MinGyunPassword {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		String[] pw = new String[n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (isPalindrom(s)) {
				System.out.printf("%d %s", s.length(), s.charAt(s.length() / 2));
				return;
			}
			for (int j = 0; j < i; j++) {
				if (isPassword(pw[j], s)) {
					System.out.printf("%d %s", s.length(), s.charAt(s.length() / 2));
					return;
				}
			}
			pw[i] = s;
		}
	}

	private boolean isPalindrom(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		}
		return true;
	}

	public boolean isPassword(String password, String s) {
		if (s.length() != password.length()) return false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != password.charAt(s.length() - i - 1)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P09933___MinGyunPassword().solve();
	}
}
