package baekjoon.solve;
import java.util.Scanner;

public class P01718___Encrpytion {

	private static final Scanner sc = new Scanner(System.in);

	private static final char[][] SQUARE = fillSquare();
	private static final int LETTERS_IN_ALPHABET = 26;

	private void solve() {
		String message = sc.nextLine();
		String key = sc.nextLine();
		System.out.println(encrypt(key, message));
	}

	private String encrypt(String key, String message) {
		StringBuilder cipher = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ' ') cipher.append(" ");
			else cipher.append(SQUARE[message.charAt(i) - 'a'][key.charAt(i % key.length()) - 'a']);
		}
		return cipher.toString();
	}

	private static char[][] fillSquare() {
		char[][] square = new char[LETTERS_IN_ALPHABET][LETTERS_IN_ALPHABET];
		int start = 'a';
		int end = start + (LETTERS_IN_ALPHABET - 1);
		int index = start;
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				index--;
				if (index < start) {
					index = end;
				}
				square[i - start][j - start] = (char) index;
			}
			index = i + 1;
		}
		return square;
	}

	public static void main(String[] args) {
		new P01718___Encrpytion().solve();
	}
}
