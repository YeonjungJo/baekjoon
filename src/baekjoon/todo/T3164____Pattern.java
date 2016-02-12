package baekjoon.todo;
import java.util.Scanner;

public class T3164____Pattern {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int ax = sc.nextInt();
		int ay = sc.nextInt();
		int bx = sc.nextInt();
		int by = sc.nextInt();

		int cnt = 0;

		for (int i = ay; i < by; i++) {
			if (i % 2 == 0) {
				if (bx > i) {
					int tmp = ax > i + 1 ? ax : i + 1;
					cnt += (bx - tmp) / 2 + (tmp % 2 == 0 ? 0 : 1);
				}
			} else {
				if (bx > i) {
					int tmp = ax > i + 1 ? ax : i + 1;
					cnt += (bx - tmp) / 2 + (tmp % 2 == 0 ? 0 : 1);
					if (ax < i) {
						cnt += i - ax + 1;
					}
				} else {
					cnt += bx - ax;
				}
			}
			System.out.println(i + " , " + cnt);
		}

		System.out.println(cnt);

	}

	public static void main(String[] args) {
		new T3164____Pattern().solve();
	}
}
