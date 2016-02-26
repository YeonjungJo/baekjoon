package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P02407___Combination {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		for (int i = n; i >= 2; i--) {
			if (i > n - m) a = a.multiply(BigInteger.valueOf(i));
			if (i <= m) b = b.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(a.divide(b));
	}

	public static void main(String[] args) {
		new P02407___Combination().solve();
	}
}
