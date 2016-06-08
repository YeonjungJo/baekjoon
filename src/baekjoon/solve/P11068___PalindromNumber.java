package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P11068___PalindromNumber {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MIN_BASE = 2;
	private static final int MAX_BASE = 64;

	private static final int IMPOSSIBLE = 0;
	private static final int POSSIBLE = 1;

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			System.out.println(search(n));
		}
	}

	private int search(int n) {
		for (int i = MIN_BASE; i <= MAX_BASE; i++) {
			if (check(n, i)) return POSSIBLE;
		}
		return IMPOSSIBLE;
	}

	private boolean check(int n, int base) {
		Integer[] conversed = baseConversion(n, base);
		return isPalindrom(conversed);
	}

	private boolean isPalindrom(Integer[] s) {
		for (int i = 0; i <= s.length / 2; i++) {
			if (!s[i].equals(s[s.length - i - 1])) return false;
		}
		return true;
	}

	private Integer[] baseConversion(int n, int base) {
		LinkedList<Integer> result = new LinkedList<>();
		while (n > 0) {
			result.add(n % base);
			n /= base;
		}
		return result.toArray(new Integer[result.size()]);
	}

	public static void main(String[] args) {
		new P11068___PalindromNumber().solve();
	}
}
