package baekjoon.solve;
import java.util.Scanner;

public class P09546___Bus3000 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			double d = 0;
			for (int i = 0; i < n; i++) {
				d += 0.5;
				d *= 2;
			}
			System.out.println((int) d);
		}
	}

	public static void main(String[] args) {
		new P09546___Bus3000().solve();
	}
}
