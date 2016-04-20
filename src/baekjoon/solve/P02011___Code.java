package baekjoon.solve;
import java.util.Scanner;

public class P02011___Code {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		int[] d = new int[s.length() + 1];
		System.out.println(search(d, s, s.length()));
	}

	private int search(int[] d, String s, int i) {
		if (i <= 0) return 1;
		if (d[i] != 0) return d[i];
		if (i == 1 && check(s)) return 1;
		if (i == 1) return 0;

		int tmp = 0;
		if (check(s.substring(0, 1))) tmp += search(d, s.substring(1), i - 1);
		if (check(s.substring(0, 2))) tmp += search(d, s.substring(2), i - 2);
		return d[i] = tmp % 1000000;
	}

	private boolean check(String s) {
		if (s.startsWith("0")) return false;
		int i = Integer.parseInt(s);
		if (i > 0 && i < 27) return true;
		return false;
	}

	public static void main(String[] args) {
		new P02011___Code().solve();
	}
}