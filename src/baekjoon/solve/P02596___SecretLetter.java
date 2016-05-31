package baekjoon.solve;
import java.util.Scanner;

public class P02596___SecretLetter {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "ABCDEFGH";
	private static final String[] CODE = { "000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010" };
	private static final char NOT_DETERMINATION = 'Z';
	private static final int LENGTH = 6;

	private void solve() {
		int n = sc.nextInt();
		String s = sc.next();

		StringBuilder letter = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char c = getLetter(s.substring(6 * i, 6 * (i + 1)));
			if (c == NOT_DETERMINATION) {
				System.out.println(i + 1);
				return;
			}
			letter.append(c);
		}
		System.out.println(letter.toString());
	}

	private char getLetter(String s) {
		int dif = s.length();
		char result = NOT_DETERMINATION;
		for (int i = 0; i < CODE.length; i++) {
			int k = compare(CODE[i], s);
			if (k == 0) return ALPHABET.charAt(i);
			if (k < dif) {
				dif = k;
				result = ALPHABET.charAt(i);
			} else if (k == dif) {
				result = NOT_DETERMINATION;
			}
		}
		return result;
	}

	private int compare(String code, String s) {
		int dif = 0;
		for (int i = 0; i < LENGTH; i++) {
			if (code.charAt(i) != s.charAt(i)) dif++;
		}
		return dif;
	}

	public static void main(String[] args) {
		new P02596___SecretLetter().solve();
	}
}
