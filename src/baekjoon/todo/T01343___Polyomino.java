package baekjoon.todo;
import java.util.Scanner;

public class T01343___Polyomino {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String[] s = sc.next().split("[.]");
		
		StringBuilder result = new StringBuilder();

		for (int k = 0; k < s.length; k++) {
			if (s[k].length() % 2 == 1) {
				System.out.println(-1);
				return;
			}
			for (int i = 0; i < s[k].length() / 4; i++)
				result.append("AAAA");
			if (s[k].length() % 4 != 0) result.append("BB");
			if (k != s.length - 1) result.append(".");
		}
		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		new T01343___Polyomino().solve();
	}
}
