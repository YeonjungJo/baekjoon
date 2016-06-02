package baekjoon.solve;
import java.util.Scanner;

public class P01343____Polyomino {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		StringBuilder result = new StringBuilder();

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'X') {
				count++;
				if (count >= 4) {
					result.append("AAAA");
					count -= 4;
				}
			} else if (s.charAt(i) == '.') {
				if (count % 2 != 0) {
					System.out.println(-1);
					return;
				} else if (count >= 2) {
					result.append("BB");
				}
				result.append(".");
				count = 0;
			}
		}

		if (count % 2 != 0) {
			System.out.println(-1);
			return;
		} else if (count >= 2) {
			result.append("BB");
		}

		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		new P01343____Polyomino().solve();
	}
}