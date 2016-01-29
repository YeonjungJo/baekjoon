package baekjoon.todo;
import java.util.Scanner;

public class T1055___Endless {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] base = sc.next().split("[$]");
		int count = sc.nextInt();
		int min = sc.nextInt();
		int max = sc.nextInt();

		for (int j = 0; j < base.length; j++) {
			base[j] = base[j].concat(input);
		}

		for (int i = 1; i < count; i++) {
			if(input.length() * base.length > max) break;
			int inputLength = input.length();
			input = "";
			for (int j = 0; j < base.length; j++) {
				input = input.concat(base[j]);
			}
			for (int j = 0; j < base.length; j++) {
				base[j] = base[j].substring(0, base[j].length() - inputLength).concat(input);
			}
		}

		String s = "";
		for (int i = 0; i < base.length; i++) {
			s = s.concat(base[i]);
		}

		for (int i = min - 1; i < max; i++) {
			if(s.length() > i) System.out.print(s.charAt(i));
			else System.out.print("-");
		}
	}

	public static void main(String[] args) {
		new T1055___Endless().solve();
	}
}
