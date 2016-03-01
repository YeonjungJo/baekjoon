package baekjoon.todo;
import java.util.Scanner;

public class T01019___BookPage {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		long[] count = new long[10];

		if (Integer.parseInt(s) < 10) {
			System.out.print("0 ");
			for (int i = 1; i <= Integer.parseInt(s); i++) {
				System.out.print("1 ");
			}
			for (int i = Integer.parseInt(s) + 1; i < 10; i++) {
				System.out.print("0 ");
			}
			return;
		}

		for (int i = 0; i < s.length(); i++) {

			int n = Character.getNumericValue(s.charAt(i));
			int tmp = Integer.parseInt(s.substring(0, i) + s.substring(i + 1));

			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					if (i == 0) continue;
					count[j] += tmp + 1 - Math.pow(10, s.length() - i - 1);
				} else {
					if (i == 0) {
						if (n > j) count[j] += Math.pow(10, s.length() - i - 1);
						if (n == j) {
							count[j] += tmp + 1;
							break;
						}
					} else {
						if (n >= j) count[j] += tmp + 1;
						if (n < j) count[j] += tmp - (tmp % Math.pow(10, s.length() - i - 1));
					}
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(count[i] + " ");
		}
	}

	public static void main(String[] args) {
		new T01019___BookPage().solve();
	}
}
