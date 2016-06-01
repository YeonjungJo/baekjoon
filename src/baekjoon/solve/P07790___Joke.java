package baekjoon.solve;
import java.util.Scanner;

public class P07790___Joke {

	private static final Scanner sc = new Scanner(System.in);

	private static final String JOKE = "joke";

	private void solve() {
		int count = 0;
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			count += countJoke(s);
		}
		System.out.println(count);
	}

	private int countJoke(String s) {
		int count = 0;

		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == JOKE.charAt(idx)) {
				idx++;
				if (idx == JOKE.length()) {
					idx = 0;
					count++;
				}
			} else idx = 0;
		}
		return count;
	}

	public static void main(String[] args) {
		new P07790___Joke().solve();
	}
}
