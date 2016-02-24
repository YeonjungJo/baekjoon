package baekjoon.solve;
import java.util.Scanner;

public class P01316___GroupWordChecker {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		int testcase = sc.nextInt();

		int count = 0;

		Loop1: for (int t = 0; t < testcase; t++) {
			boolean[] d = new boolean[LOWERCASE_ALPHABET.length()];
			String s = sc.next();
			while (s.length() > 0) {
				char c = s.charAt(0);
				if (d[LOWERCASE_ALPHABET.indexOf(c)]) continue Loop1;
				d[LOWERCASE_ALPHABET.indexOf(c)] = true;
				s = s.replaceFirst("[" + c + "]*", "");
			}
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new P01316___GroupWordChecker().solve();
	}
}
