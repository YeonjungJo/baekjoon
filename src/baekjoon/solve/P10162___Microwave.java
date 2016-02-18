package baekjoon.solve;
import java.util.Scanner;

public class P10162___Microwave {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] TIMER = { 300, 60, 10 };

	private void solve() {
		int n = sc.nextInt();

		int[] control = new int[3];

		for (int i = 0; i < 3; i++) {
			if (n >= TIMER[i]) control[i] += n / TIMER[i];
			n -= TIMER[i] * control[i];
		}

		if (n != 0) System.out.println(-1);
		else {
			for (int i = 0; i < 3; i++) {
				System.out.print(control[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		new P10162___Microwave().solve();
	}
}
