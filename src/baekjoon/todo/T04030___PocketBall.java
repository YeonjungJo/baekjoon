package baekjoon.todo;
import java.util.Scanner;

public class T04030___PocketBall {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = 1;
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) return;

			int cnt = 0;

			int start = (int) Math.sqrt(a);
			double tmp = Math.sqrt(b);
			int end = (int) tmp;
			if (tmp != end) end++;

			for (int i = start + 1; i < end; i++) {
				int k = i * i - 1;
				double p = (-1 + Math.sqrt(1 + 8 * k)) / 2;
				if (p == (int) p) {
					System.out.println("match : " + k);
					cnt++;
				}
			}

			System.out.printf("Case %d: %d\n", testcase++, cnt);
		}

	}

	public static void main(String[] args) {
		new T04030___PocketBall().solve();
	}
}
