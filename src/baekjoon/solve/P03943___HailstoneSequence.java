package baekjoon.solve;
import java.util.Scanner;

public class P03943___HailstoneSequence {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {

			int n = sc.nextInt();

			int max = n;

			while (n != 1) {
				if (n % 2 == 0) n /= 2;
				else n = n * 3 + 1;
				if (n > max) max = n;
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new P03943___HailstoneSequence().solve();
	}
}
