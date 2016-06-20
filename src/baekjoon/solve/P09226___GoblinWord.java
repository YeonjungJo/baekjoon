package baekjoon.solve;
import java.util.Scanner;

public class P09226___GoblinWord {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			String s = sc.next();
			if (s.equals("#")) return;

			if (s.equals(s.replaceAll("[a|e|i|o|u]", ""))) {
				System.out.println(s + "ay");
				continue;
			}

			StringBuilder result = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					result.insert(0, s.substring(i));
					result.append("ay");
					System.out.println(result.toString());
					break;
				} else {
					result.append(c);
				}
			}
		}
	}

	public static void main(String[] args) {
		new P09226___GoblinWord().solve();
	}
}
