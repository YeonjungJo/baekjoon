package baekjoon.solve;
import java.util.Scanner;

public class P05532___HolidayTask {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int m = max(getDate(b, d), getDate(a, c));
		System.out.println(l - m >= 0 ? l - m : 0);
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	private int getDate(int a, int b) {
		return (a / b) + (a % b == 0 ? 0 : 1);
	}

	public static void main(String[] args) {
		new P05532___HolidayTask().solve();
	}
}
