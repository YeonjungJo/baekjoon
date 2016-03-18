package baekjoon.solve;
import java.util.Scanner;

public class P05523___GameResult {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();

		int a = 0;
		int b = 0;
		for (int t = 0; t < testcase; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			if (i > j) a++;
			if (j > i) b++;
		}
		
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		new P05523___GameResult().solve();
	}
}
