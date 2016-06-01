package baekjoon.solve.basic;
import java.util.Scanner;

public class VigenereCipherEncryption {

	private static final Scanner sc = new Scanner(System.in);

	private static final char[][] SQUARE = fillSquare();
	private static final int LETTERS_IN_ALPHABET = 26;

	private void solve() {
		while (true) {
			String key = sc.next();
			if (key.equals("0")) return;
			String message = sc.next();
			System.out.println(encrypt(key, message));
		}
	}

	private String encrypt(String key, String message) {
		StringBuilder cipher = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			cipher.append(SQUARE[key.charAt(i % key.length()) - 'A'][message.charAt(i) - 'A']);
		}
		return cipher.toString();
	}

	private static char[][] fillSquare() {
		char[][] square = new char[LETTERS_IN_ALPHABET][LETTERS_IN_ALPHABET];
		int start = 'A';
		int end = start + (LETTERS_IN_ALPHABET - 1);
		int index = start;
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				index++;
				if (index > end) {
					index = start;
				}
				square[i - start][j - start] = (char) index;
			}
			index = i + 1;
		}
		return square;
	}

	public static void main(String[] args) {
		new VigenereCipherEncryption().solve();
	}
}
