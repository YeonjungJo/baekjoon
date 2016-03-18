package baekjoon.solve;
import java.util.Scanner;

public class P11091___WriteEveryAlphabets {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 0; t < testcase; t++) {
			boolean[] e = new boolean[LOWERCASE_ALPHABET.length()];
			String s = sc.nextLine().toLowerCase();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (Character.isAlphabetic(c)) e[LOWERCASE_ALPHABET.indexOf(c)] = true;
			}
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < e.length; i++) {
				if (!e[i]) strBuilder.append(LOWERCASE_ALPHABET.charAt(i));
			}

			System.out.println(strBuilder.length() == 0 ? "pangram" : "missing " + strBuilder.toString());
		}
	}

	public static void main(String[] args) {
		new P11091___WriteEveryAlphabets().solve();
	}
}
