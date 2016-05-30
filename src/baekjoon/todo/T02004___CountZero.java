package baekjoon.todo;
import java.util.Scanner;

public class T02004___CountZero {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		m = Integer.min(m, n - m);

		long two = 0;
		long five = 0;

		for (int i = n; i > n - m; i--) {
			two += get(i, 2);
			five += get(i, 5);
		}

		for (int i = m; i > 1; i--) {
			two -= get(i, 2);
			five -= get(i, 5);
		}
		System.out.println(Long.min(two, five));
	}

	private int get(int n, int k) {
		String s = Integer.toString(n, k);
		return s.length() - s.replaceAll("[0]+$", "").length();
	}

	public static void main(String[] args) {
		new T02004___CountZero().solve();
	}
}
