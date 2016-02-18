package baekjoon.solve;
import java.util.Scanner;

public class P01769___MultipleOfThree {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();

		for (int k = 0;; k++) {
			if (s.length() == 1) {
				System.out.println(k);
				System.out.println(Integer.parseInt(s) % 3 == 0 ? "YES" : "NO");
				return;
			}

			int tmp = 0;
			for (int i = 0; i < s.length(); i++) {
				tmp += Character.getNumericValue(s.charAt(i));
			}
			s = Integer.toString(tmp);
		}
	}

	public static void main(String[] args) {
		new P01769___MultipleOfThree().solve();
	}
}
