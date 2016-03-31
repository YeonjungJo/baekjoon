package baekjoon.solve;
import java.util.Scanner;

public class P03164___Pattern {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt() - 1;
		int d = sc.nextInt() - 1;

		long count = 0;
		for (int i = b; i <= d; i++) {
			// System.out.println(countBlack(i, a, c));
			count += countBlack(i, a, c);
		}

		System.out.println(count);
	}

	private int countBlack(int i, int start, int end) {
		if (i <= start) {
			return get(0, i, start, end);
		} else if (i >= end) {
			return get(1, i, start, end);
		} else {
			return get(1, i, start, i) + get(0, i, i + 1, end);
		}
	}

	private int get(int type, int i, int start, int end) {
		// System.out.printf("%d : %d - %d : ", i, start, end);
		if (type == 0) {
			if (i % 2 == 0) {
				if (end % 2 == 1 && start % 2 == 1) {
					// System.out.printf("%d\n", (end - start + 1) / 2 + 1);
					return (end - start + 1) / 2 + 1;
				} else {
					// System.out.printf("%d\n", (end - start + 1) / 2);
					return (end - start + 1) / 2;
				}
			} else {
				if (end % 2 == 1 && start % 2 == 1) {
					// System.out.printf("%d\n", (end - start + 1) / 2 + 1);
					return (end - start + 1) / 2 + 1;
				} else {
					// System.out.printf("%d\n", (end - start + 1) / 2);
					return (end - start + 1) / 2;
				}
			}
		}

		// System.out.println(i % 2 == 1 ? end - start + 1 : 0);
		return i % 2 == 1 ? end - start + 1 : 0;
	}

	public static void main(String[] args) {
		new P03164___Pattern().solve();
	}
}
