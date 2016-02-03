package baekjoon.todo;
import java.util.Scanner;

public class T10824___FourNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next().concat(sc.next());
		String b = sc.next().concat(sc.next());

		String max = a.length() > b.length() ? a : b;
		String min = a.length() > b.length() ? b : a;

		StringBuilder result = new StringBuilder(max);

		int carry = 0;

		for (int i = 0; i < min.length(); i++) {
			int minp = min.length() - i - 1;
			int maxp = max.length() - i - 1;

			int sum = plus(min.charAt(minp), max.charAt(maxp)) + carry;
			if (sum >= 10) carry = 1;
			else carry = 0;

			result.replace(maxp, maxp + 1, Integer.toString(sum % 10));
		}

		if (carry != 0) result.insert(0, carry);

		System.out.println(result.toString());
	}

	private int plus(char min, char max) {
		return Character.getNumericValue(min) + Character.getNumericValue(max);
	}

	public static void main(String[] args) {
		new T10824___FourNumber().solve();
	}
}
