package baekjoon.solve;
import java.util.Scanner;

public class P01105___Eight {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String b = sc.next();

		if (a.length() != b.length()) {
			System.out.println(0);
			return;
		}

		if (a.equals(b)) {
			System.out.println(a.length() - a.replaceAll("8", "").length());
			return;
		}

		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				if (a.charAt(i) == '8') count++;
				continue;
			}
			System.out.println(count);
			return;
		}
	}

	public static void main(String[] args) {
		new P01105___Eight().solve();
	}
}
