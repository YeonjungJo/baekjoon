package baekjoon.solve;
import java.util.Scanner;

public class P02804___CrossWord {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String b = sc.next();
		for (int i = 0; i < a.length(); i++) {
			if (b.contains(a.substring(i, i + 1))) {
				printCrossWord(a, b, i, b.indexOf(a.charAt(i)));
				return;
			}
		}
	}

	private void printCrossWord(String a, String b, int x, int y) {
		for (int i = 0; i < b.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (j != x && i != y) System.out.print(".");
				if (j == x) System.out.print(b.charAt(i));
				else if (i == y) System.out.print(a.charAt(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P02804___CrossWord().solve();
	}
}
