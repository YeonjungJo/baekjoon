package baekjoon.solve;
import java.util.Scanner;

public class P04447___GoodManBadMan {

	private static final Scanner sc = new Scanner(System.in);

	private static final String GOOD = " is GOOD";
	private static final String BAD = " is A BADDY";
	private static final String NEUTRAL = " is NEUTRAL";

	private void solve() {
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine().replace("\n", "");

			int b = 0;
			int g = 0;
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == 'b' || c == 'B') b++;
				if (c == 'g' || c == 'G') g++;
			}

			if (g > b) System.out.println(s + GOOD);
			else if (g < b) System.out.println(s + BAD);
			else System.out.println(s + NEUTRAL);
		}
	}

	public static void main(String[] args) {
		new P04447___GoodManBadMan().solve();
	}
}
