package baekjoon.solve;
import java.util.Scanner;

public class P09536___WhatDoesTheFoxSay {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 0; t < testcase; t++) {
			String[] s = sc.nextLine().split(" ");
			while (true) {
				String a = sc.nextLine();
				if (a.equals("what does the fox say?")) break;
				find(s, a.split(" ")[2]);
			}

			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < s.length; i++) {
				if (!s[i].equals("")) strBuilder.append(s[i] + " ");
			}

			System.out.println(strBuilder.toString());
		}
	}

	private void find(String[] s, String string) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(string)) s[i] = "";
		}
	}

	public static void main(String[] args) {
		new P09536___WhatDoesTheFoxSay().solve();
	}
}
