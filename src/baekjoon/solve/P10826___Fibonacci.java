package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P10826___Fibonacci {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println(n);
			return;
		}

		BigInteger[] d = new BigInteger[n + 1];
		d[0] = BigInteger.ZERO;
		d[1] = BigInteger.ONE;

		for (int i = 2; i <= n; i++) {
			d[i] = d[i - 1].add(d[i - 2]);
		}

		System.out.println(d[n]);
	}

	public static void main(String[] args) {
		new P10826___Fibonacci().solve();
	}
}
