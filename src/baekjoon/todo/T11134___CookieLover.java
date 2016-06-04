package baekjoon.todo;
import java.util.Scanner;

public class T11134___CookieLover {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(n / m + n % m);
		}
	}

	public static void main(String[] args) {
		new T11134___CookieLover().solve();
	}
}
