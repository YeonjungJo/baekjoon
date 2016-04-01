package baekjoon.solve;
import java.util.Scanner;

public class P05217___SumOfPair {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			System.out.printf("Pairs for %d:", n);

			boolean b = false;
			for (int i = 1; i <= 5; i++) {
				int tmp = n - i;
				if (tmp > i && tmp <= 12) {
					System.out.printf("%s %d %d", (b ? "," : ""), i, tmp);
					b = true;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P05217___SumOfPair().solve();
	}
}
