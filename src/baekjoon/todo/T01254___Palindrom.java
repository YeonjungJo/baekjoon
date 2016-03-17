package baekjoon.todo;
import java.util.Scanner;

public class T01254___Palindrom {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		if (s.length() == 1) {
			System.out.println(1);
			return;
		}
		for (int k = s.length() / 2; k < s.length(); k++) {
			if (isPalindromEven(k, s)) {
				System.out.println(2 * k);
				return;
			}
			if (isPalindrom(k, s)) {
				System.out.println(2 * k + 1);
				return;
			}
		}
	}

	private boolean isPalindromEven(int k, String s) {
		for (int i = 1; i <= k && k + i - 1 < s.length(); i++) {
			if (s.charAt(k - i) != s.charAt(k + i - 1)) return false;
		}
		return true;
	}

	private boolean isPalindrom(int k, String s) {
		for (int i = 1; i <= k && k + i < s.length(); i++) {
			if (s.charAt(k - i) != s.charAt(k + i)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new T01254___Palindrom().solve();
	}
}
