import java.util.Scanner;

public class P06996___Anagram {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String a = sc.next();
			String b = sc.next();

			if (anagram(a, b)) {
				System.out.printf("%s & %s are anagrams.\n", a, b);
			} else {
				System.out.printf("%s & %s are NOT anagrams.\n", a, b);
			}
		}
	}

	private boolean anagram(String a, String b) {
		if (a.length() != b.length()) return false;
		for (int i = 0; i < LOWERCASE_ALPHABET.length(); i++) {
			String c = LOWERCASE_ALPHABET.substring(i, i + 1);
			if (a.replaceAll(c, "").length() != b.replaceAll(c, "").length()) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P06996___Anagram().solve();
	}
}
