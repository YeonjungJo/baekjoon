package baekjoon.solve;
import java.util.Scanner;

public class P10178___CandyOfHalloween {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int candy = sc.nextInt();
			int child = sc.nextInt();
			System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", candy / child, candy % child);
		}
	}

	public static void main(String[] args) {
		new P10178___CandyOfHalloween().solve();
	}
}
