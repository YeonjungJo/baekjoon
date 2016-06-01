package baekjoon.todo;
import java.util.Scanner;

public class T03024___MarathonTicTacToe {

	private static final Scanner sc = new Scanner(System.in);

	private static final char EMPTY = '.';

	private void solve() {
		int n = sc.nextInt();

		char[] c = new char[n];
		char[] d = new char[2];

		boolean[] flagC = new boolean[n];
		boolean[] flagD = new boolean[2];

		for (int i = 0; i < n; i++) {
			String s = sc.next();

			if (i == 0) {
				c = s.toCharArray();
				d[0] = c[0];
				d[1] = c[n - 1];

				for (int j = 0; j < n; j++) {
					if (c[j] != EMPTY) flagC[j] = true;
				}

				for (int j = 0; j < 2; j++) {
					if (d[j] != EMPTY) flagD[j] = true;
				}
			} else {
				for (int j = 0; j < n; j++) {
					if (flagC[j] && c[j] != s.charAt(j)) flagC[j] = false;
				}
				if (flagD[0] && d[0] != s.charAt(i - 1)) flagD[0] = false;
				if (flagD[1] && d[1] != s.charAt(n - i - 1)) flagD[1] = false;
			}

			char tmp = s.charAt(0);
			if (tmp != EMPTY && s.matches("[" + tmp + "]*")) {
				System.out.println(tmp);
				return;
			}
		}
		for (int i = 0; i < n; i++) {
			if (flagC[i]) {
				System.out.println(c[i]);
				return;
			}
		}
		if (flagD[0]) {
			System.out.println(d[0]);
			return;
		}
		if (flagD[1]) {
			System.out.println(d[1]);
			return;
		}
		System.out.println("ongoing");
	}

	public static void main(String[] args) {
		new T03024___MarathonTicTacToe().solve();
	}
}
