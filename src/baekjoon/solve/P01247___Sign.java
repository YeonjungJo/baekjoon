package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P01247___Sign {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		for (int t = 0; t < 3; t++) {
			BigInteger bi = BigInteger.ZERO;

			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				bi = bi.add(sc.nextBigInteger());
			}

			if (bi.compareTo(BigInteger.ZERO) == 1) System.out.println("+");
			if (bi.compareTo(BigInteger.ZERO) == -1) System.out.println("-");
			if (bi.compareTo(BigInteger.ZERO) == 0) System.out.println("0");
		}
	}

	public static void main(String[] args) {
		new P01247___Sign().solve();
	}
}
