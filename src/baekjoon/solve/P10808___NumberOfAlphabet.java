package baekjoon.solve;
import java.util.Scanner;

public class P10808___NumberOfAlphabet {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		int[] data = new int[26];
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			data[ALPHABET.indexOf(input.charAt(i))]++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] args) {
		new P10808___NumberOfAlphabet().solve();
	}
}
