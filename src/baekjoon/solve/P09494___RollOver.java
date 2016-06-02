package baekjoon.solve;
import java.util.Scanner;

public class P09494___RollOver {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int line = Integer.parseInt(sc.nextLine());
			if (line == 0) return;

			String[] s = new String[line];
			for (int l = 0; l < line; l++) {
				s[l] = sc.nextLine();
			}

			int position = 0;
			for (int i = 0; i < line; i++) {
				position = drop(s, i, position);
			}

			System.out.println(position + 1);
		}
	}

	private int drop(String[] s, int i, int position) {
		if (s[i].length() < position) return position;
		for (int j = position; j < s[i].length(); j++) {
			if (s[i].charAt(j) == ' ') return j;
		}
		return s[i].length();
	}

	public static void main(String[] args) {
		new P09494___RollOver().solve();
	}
}
