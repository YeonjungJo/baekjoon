package baekjoon.solve;
import java.util.Scanner;

public class P05582___CommonSubstring {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String b = sc.next();

		int max = 0;
		for (int i = -a.length() + 1; i < b.length(); i++) {
			int tmp = search(a, b, i);
			if (tmp > max) max = tmp;
		}
		System.out.println(max);
	}

	private int search(String a, String b, int d) {
		int max = 0;
		int tmp = 0;

		for (int i = d > 0 ? 0 : d; i < b.length(); i++) {
			if (check(a, b, d, i)) tmp++;
			else {
				if (max < tmp) max = tmp;
				tmp = 0;
			}
		}
		
		if (max < tmp) return tmp;
		return max;
	}

	private boolean check(String a, String b, int d, int i) {
		if (i < 0 || i + d < 0 || i >= a.length() || i + d >= b.length()) return false;
		return a.charAt(i) == b.charAt(i + d) ? true : false;
	}

	public static void main(String[] args) {
		new P05582___CommonSubstring().solve();
	}
}
