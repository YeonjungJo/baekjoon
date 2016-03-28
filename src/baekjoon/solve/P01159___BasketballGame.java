package baekjoon.solve;
import java.util.Scanner;

public class P01159___BasketballGame {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		int[] name = new int[LOWERCASE_ALPHABET.length()];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			name[LOWERCASE_ALPHABET.indexOf(sc.next().charAt(0))]++;
		}

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < name.length; i++) {
			if (name[i] >= 5) strBuilder.append(LOWERCASE_ALPHABET.charAt(i));
		}

		if (strBuilder.length() == 0) System.out.println("PREDAJA");
		else System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P01159___BasketballGame().solve();
	}
}
