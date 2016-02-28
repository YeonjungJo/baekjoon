package baekjoon.solve;
import java.util.Scanner;

public class P01440___TimeMachine {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String[] time = sc.nextLine().split(":");

		int countHour = 0;
		for (int i = 0; i < 3; i++) {
			int tmp = Integer.parseInt(time[i]);
			if (tmp <= 12 && tmp > 0) countHour++;
			if (tmp > 59) {
				System.out.println(0);
				return;
			}
		}

		System.out.println(countHour * 2);
	}

	public static void main(String[] args) {
		new P01440___TimeMachine().solve();
	}
}
