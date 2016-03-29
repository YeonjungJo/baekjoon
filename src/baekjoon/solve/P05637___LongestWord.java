package baekjoon.solve;
import java.util.Scanner;

public class P05637___LongestWord {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String longestWord = "";
		while (true) {
			String s = sc.next();
			if (s.equals("E-N-D")) {
				System.out.println(longestWord.toLowerCase());
				return;
			}
			String[] word = s.split("[^a-zA-Z|-]");
			for (int i = 0; i < word.length; i++) {
				if (word[i].length() > longestWord.length()) longestWord = word[i];
			}
		}
	}

	public static void main(String[] args) {
		new P05637___LongestWord().solve();
	}
}
