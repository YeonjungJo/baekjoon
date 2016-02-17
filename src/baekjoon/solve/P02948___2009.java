package baekjoon.solve;
import java.util.Scanner;

public class P02948___2009 {

	private static final Scanner sc = new Scanner(System.in);

	private static final String[] day = { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday" };
	private static final int[] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private void solve() {
		int d = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 1; i < m; i++) {
			d += date[i - 1];
		}

		System.out.println(day[d % 7]);
	}

	public static void main(String[] args) {
		new P02948___2009().solve();
	}
}
