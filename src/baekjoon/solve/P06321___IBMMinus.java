package baekjoon.solve;

import java.util.Scanner;

public class P06321___IBMMinus {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			String k = sc.next();
			StringBuilder strBuilder = new StringBuilder();
			for (int j = 0; j < k.length(); j++) {
				int idx = ALPHABET.indexOf(k.charAt(j)) + 1;
				strBuilder.append(ALPHABET.charAt(idx >= ALPHABET.length() ? 0 : idx));
			}
			System.out.println("String #" + i);
			System.out.println(strBuilder.toString() + "\n");
		}
	}

	public static void main(String[] args) {
		new P06321___IBMMinus().solve();
	}
}
