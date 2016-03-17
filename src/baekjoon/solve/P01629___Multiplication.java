package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P01629___Multiplication {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();

		System.out.println(a.modPow(b, c));
	}

	public static void main(String[] args) {
		new P01629___Multiplication().solve();
	}
}
