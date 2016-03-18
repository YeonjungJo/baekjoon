package baekjoon.solve;
import java.util.Scanner;

public class P05675___MinAndHourHands {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			get(a);
		}
	}

	private void get(int a) {
		for (int i = 0; i < 720; i++) {
			if (Math.abs(6 * (i % 360) - 6 * (i / 12)) == a) {
				System.out.println("Y");
				return;
			}
		}
		System.out.println("N");
	}

	public static void main(String[] args) {
		new P05675___MinAndHourHands().solve();
	}
}
