package baekjoon.solve;
import java.util.Scanner;

public class P01283___SetShortCut {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		int n = Integer.parseInt(sc.nextLine());
		boolean[] shortcut = new boolean[ALPHABET.length()];

		for (int i = 0; i < n; i++) {
			String[] option = sc.nextLine().split(" ");
			getShortcut(shortcut, option);

		}
	}

	private void getShortcut(boolean[] shortcut, String[] option) {
		for (int i = 0; i < option.length; i++) {
			int idx = ALPHABET.indexOf(option[i].toLowerCase().charAt(0));
			if (!shortcut[idx]) {
				shortcut[idx] = true;
				print(option, i, 0);
				return;
			}
		}
		for (int i = 0; i < option.length; i++) {
			for (int j = 0; j < option[i].length(); j++) {
				int idx = ALPHABET.indexOf(option[i].toLowerCase().charAt(j));
				if (!shortcut[idx]) {
					shortcut[idx] = true;
					print(option, i, j);
					return;
				}
			}
		}
		print(option, -1, -1);
	}

	private void print(String[] option, int a, int b) {
		StringBuilder strBuilder = new StringBuilder();
		if (a == -1 && b == -1) {
			for (int i = 0; i < option.length; i++) {
				strBuilder.append(option[i] + " ");
			}
		} else {
			for (int i = 0; i < option.length; i++) {
				for (int j = 0; j < option[i].length(); j++) {
					if (i == a && j == b) {
						strBuilder.append("[");
						strBuilder.append(option[i].charAt(j));
						strBuilder.append("]");
					} else {
						strBuilder.append(option[i].charAt(j));
					}
				}
				strBuilder.append(" ");
			}
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P01283___SetShortCut().solve();
	}
}
