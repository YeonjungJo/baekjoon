package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P02986___Pascal {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println(0);
			return;
		}

		if (BigInteger.valueOf(n).isProbablePrime(1)) {
			System.out.println(n - 1);
			return;
		}

		for (BigInteger factor = BigInteger.valueOf(2); factor.compareTo(BigInteger.valueOf(n)) <= 0; factor = factor.nextProbablePrime()) {
			if (n % factor.intValue() == 0) {
				System.out.println(n - (n / factor.intValue()));
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P02986___Pascal().solve();
	}
}
