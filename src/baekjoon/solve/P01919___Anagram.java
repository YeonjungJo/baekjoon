package baekjoon.solve;
import java.util.Scanner;

public class P01919___Anagram {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		String a = sc.nextLine();
		String b = sc.nextLine();

		int result = 0;

		for (int i = 0; i < ALPHABET.length(); i++) {
			int j = a.length() - a.replace(Character.toString(ALPHABET.charAt(i)), "").length();
			int k = b.length() - b.replace(Character.toString(ALPHABET.charAt(i)), "").length();

			result += Math.abs(j - k);
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new P01919___Anagram().solve();
	}
}
