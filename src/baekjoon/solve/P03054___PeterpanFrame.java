package baekjoon.solve;
import java.util.Scanner;

public class P03054___PeterpanFrame {

	private static final Scanner sc = new Scanner(System.in);

	private static final int WENDY = 3;
	private static final int FIRST = 1;
	private static final int SECOND = 2;

	private void solve() {
		String s = sc.next();
		StringBuilder strBuilder = new StringBuilder();

		String a = get(s.length(), FIRST);
		String b = get(s.length(), SECOND);

		StringBuilder tmp = new StringBuilder("#");
		for (int i = 1; i <= s.length(); i++) {
			if (i % WENDY == 0) {
				tmp.setLength(tmp.length() - 1);
				tmp.append("*.").append(s.charAt(i - 1)).append(".*");
			} else tmp.append(".").append(s.charAt(i - 1)).append(".#");
		}
		tmp.append("\n");

		strBuilder.append(a).append(b).append(tmp).append(b).append(a);
		System.out.println(strBuilder.toString());

	}

	private String get(int length, int l) {
		StringBuilder stringBuilder = new StringBuilder(".");
		if (l == FIRST) {
			for (int i = 1; i <= length; i++) {
				stringBuilder.append(i % WENDY == 0 ? ".*.." : ".#..");
			}
		} else {
			for (int i = 1; i <= length; i++) {
				stringBuilder.append(i % WENDY == 0 ? "*.*." : "#.#.");
			}
		}
		stringBuilder.append("\n");
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		new P03054___PeterpanFrame().solve();
	}
}
