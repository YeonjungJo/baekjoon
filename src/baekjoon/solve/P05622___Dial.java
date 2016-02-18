package baekjoon.solve;
import java.util.Scanner;

public class P05622___Dial {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LARGE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private static final int[] COST = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };

	private void solve() {
		String s = sc.next();

		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			result += COST[LARGE_ALPHABET.indexOf(s.charAt(i))];
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P05622___Dial().solve();
	}
}
