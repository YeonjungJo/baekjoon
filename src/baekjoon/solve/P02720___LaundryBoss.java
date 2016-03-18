package baekjoon.solve;
import java.util.Scanner;

public class P02720___LaundryBoss {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] UNIT = { 25, 10, 5, 1 };

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			get(sc.nextInt());
		}
	}

	private void get(int n) {
		for (int i = 0; i < UNIT.length; i++) {
			System.out.print(n / UNIT[i] + " ");
			n -= UNIT[i] * (n / UNIT[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new P02720___LaundryBoss().solve();
	}
}
