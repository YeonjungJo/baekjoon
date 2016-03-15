package baekjoon.solve;
import java.util.Scanner;

public class P05598___CaesarCipher {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String TRANSLATE = "DEFGHIJKLMNOPQRSTUVWXYZABC";

	private void solve() {
		String s = sc.nextLine();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			strBuilder.append(ALPHABET.charAt(TRANSLATE.indexOf(s.charAt(i))));
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P05598___CaesarCipher().solve();
	}
}
