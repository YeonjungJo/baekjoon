package baekjoon.solve;
import java.util.Scanner;

public class P05555___Ring {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		int n = sc.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) == s.charAt(0) && check(s, tmp, j)) {
					count++;
					break;
				}
			}
		}

		System.out.println(count);
	}

	private boolean check(String s, String tmp, int j) {
		for (int i = 0; i < s.length(); i++, j++) {
			if (j >= tmp.length()) j -= tmp.length();
			if (s.charAt(i) != tmp.charAt(j)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P05555___Ring().solve();
	}
}
