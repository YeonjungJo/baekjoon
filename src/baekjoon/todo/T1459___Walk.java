package baekjoon.todo;
import java.util.Scanner;

public class T1459___Walk {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		int w = sc.nextInt();
		int s = sc.nextInt();

		if (s >= 2 * w) {
			System.out.println((x + y) * w);
		} else {
			System.out.println((s * (x > y ? y : x)) + (w * Math.abs(x - y)));
		}
	}

	public static void main(String[] args) {
		new T1459___Walk().solve();
	}
}
