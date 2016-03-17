package baekjoon.solve;
import java.util.Scanner;

public class P02703___Cryptoquote {

	private static final Scanner sc = new Scanner(System.in);

	private static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 0; t < testcase; t++) {
			String cryptoquote = sc.nextLine();
			String rule = sc.nextLine();

			StringBuilder original = new StringBuilder();
			for (int i = 0; i < cryptoquote.length(); i++) {
				if (cryptoquote.charAt(i) == ' ') original.append(" ");
				else original.append(rule.charAt(UPPERCASE_ALPHABET.indexOf(cryptoquote.charAt(i))));
			}

			System.out.println(original.toString());
		}
	}

	public static void main(String[] args) {
		new P02703___Cryptoquote().solve();
	}
}
