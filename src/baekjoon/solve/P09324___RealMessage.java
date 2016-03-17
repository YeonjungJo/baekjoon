package baekjoon.solve;
import java.util.Scanner;

public class P09324___RealMessage {

	private static final Scanner sc = new Scanner(System.in);

	private static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		int testcase = sc.nextInt();
		Loop1: for (int t = 0; t < testcase; t++) {
			int[] freq = new int[UPPERCASE_ALPHABET.length()];
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				int idx = UPPERCASE_ALPHABET.indexOf(s.charAt(j));
				freq[idx]++;
				if (freq[idx] % 3 == 0) {
					if (j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) j++;
					else {
						System.out.println("FAKE");
						continue Loop1;
					}
				}
			}
			System.out.println("OK");
		}
	}

	public static void main(String[] args) {
		new P09324___RealMessage().solve();
	}
}
