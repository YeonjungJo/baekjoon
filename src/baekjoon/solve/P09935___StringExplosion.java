package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P09935___StringExplosion {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		String b = sc.next();

		StringBuilder result = new StringBuilder();
		LinkedList<StringBuilder> stack = new LinkedList<>();
		StringBuilder tmp = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == b.charAt(tmp.length())) {
				tmp.append(s.charAt(i));
			} else if (s.charAt(i) == b.charAt(0)) {
				if (tmp.length() != 0) stack.add(tmp);
				tmp = new StringBuilder();
				tmp.append(s.charAt(i));
			} else {
				while (!stack.isEmpty())
					result.append(stack.removeFirst());
				result.append(tmp);
				result.append(s.charAt(i));
				tmp = new StringBuilder();
			}
			if (tmp.length() == b.length()) {
				tmp = stack.pollLast();
				if (tmp == null) {
					tmp = new StringBuilder();
				}
			}

			// StringBuilder strBuilder = new StringBuilder();
			// for (int k = 0; k < stack.size(); k++) {
			// strBuilder.append(stack.get(k));
			// }
			// System.out.println("s[i] : " + s.charAt(i));
			// System.out.println("result : " + result);
			// System.out.println("tmp : " + tmp);
			// System.out.println("stack : " + strBuilder.toString());
			// System.out.println();
		}

		while (!stack.isEmpty())
			result.append(stack.removeFirst());
		result.append(tmp);

		if (result.length() == 0) System.out.println("FRULA");
		else System.out.println(result.toString());
	}

	public static void main(String[] args) {
		new P09935___StringExplosion().solve();
	}
}
