package baekjoon.solve;
import java.util.Scanner;

public class P10250___ACMHotel {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			int floor = (n % h);
			int room = (n / h) + 1;
			if (floor == 0) {
				floor = h;
				room = n / h;
			}

			System.out.printf("%d%02d\n", floor, room);
		}
	}

	public static void main(String[] args) {
		new P10250___ACMHotel().solve();
	}
}
