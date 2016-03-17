package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P07523___Gau {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			BigInteger result = BigInteger.valueOf(n + m).multiply(BigInteger.valueOf((m - n + 1) / 2));
			System.out.printf("Scenario #%d:\n", t);
			if ((m - n + 1) % 2 == 1) {
				result = result.add(BigInteger.valueOf((n + m) / 2));
			}
			System.out.printf("%d\n\n", result);
		}
	}

	public static void main(String[] args) {
		new P07523___Gau().solve();
	}
}
