package baekjoon.solve;
import java.util.Scanner;

public class P09229___WordLadder {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			String s = sc.next();
			if (s.equals("#")) return;
			getResult(s);
		}
	}

	private void getResult(String a) {
		boolean isCorrect = true;
		while (true) {
			String s = sc.next();
			if (s.equals("#")) {
				if (isCorrect) System.out.println("Correct");
				return;
			}
			if (isCorrect && !check(a.toCharArray(), s.toCharArray())) {
				System.out.println("Incorrect");
				isCorrect = false;
			}
			a = s;
		}
	}

	private boolean check(char[] a, char[] b) {
		if (a.length != b.length) return false;

		int incorrect = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				incorrect++;
			}
		}
		return incorrect == 1 ? true : false;
	}

	public static void main(String[] args) {
		new P09229___WordLadder().solve();
	}
}
