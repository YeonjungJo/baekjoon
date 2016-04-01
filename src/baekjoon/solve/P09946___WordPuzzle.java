package baekjoon.solve;
import java.util.Scanner;

public class P09946___WordPuzzle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		for (int t = 1;; t++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			if (a.equals("END") && b.equals("END")) return;

			System.out.printf("Case %d: %s\n", t, isSame(a, b) ? "same" : "different");
		}
	}

	private boolean isSame(String a, String b) {
		while (a.length() > 0 && b.length() > 0) {
			if (a.length() != b.length()) return false;
			String c = Character.toString(a.charAt(0));
			a = a.replaceAll(c, "");
			b = b.replaceAll(c, "");
		}
		if (a.length() != b.length()) return false;
		return true;
	}

	public static void main(String[] args) {
		new P09946___WordPuzzle().solve();
	}
}
