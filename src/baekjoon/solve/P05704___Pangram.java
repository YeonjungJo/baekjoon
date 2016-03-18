package baekjoon.solve;
import java.util.Scanner;

public class P05704___Pangram {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		while (true) {
			boolean[] d = new boolean[ALPHABET.length()];
			String s = sc.nextLine().replaceAll(" ", "");
			if (s.equals("*")) return;

			isPangram(d, s);
		}
	}

	private void isPangram(boolean[] d, String s) {
		for (int i = 0; i < s.length(); i++) {
			d[ALPHABET.indexOf(s.charAt(i))] = true;
		}
		for (int i = 0; i < d.length; i++) {
			if (!d[i]) {
				System.out.println("N");
				return;
			}
		}
		System.out.println("Y");
		return;
	}

	public static void main(String[] args) {
		new P05704___Pangram().solve();
	}
}
