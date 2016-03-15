package baekjoon.solve;
import java.util.Scanner;

public class P03226___PhoneBill {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int bill = 0;

		for (int i = 0; i < n; i++) {
			String[] tmp = sc.next().split(":");
			int time = Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
			bill += calculateBill(time, sc.nextInt());
		}

		System.out.println(bill);
	}

	private int calculateBill(int start, int min) {
		int result = 0;
		int end = start + min;
		if (start >= 420 && start <= 1140) {
			if (end <= 1140) result += min * 10;
			else result += (1140 - start) * 10 + (end - 1140) * 5;
		} else if (start < 420) {
			if (end < 420) result += min * 5;
			else result += (420 - start) * 5 + (end - 420) * 10;
		} else if (start > 1140) {
			result += min * 5;
		}
		return result;
	}

	public static void main(String[] args) {
		new P03226___PhoneBill().solve();
	}
}
