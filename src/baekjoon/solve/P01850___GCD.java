package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P01850___GCD {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		int gcd = a.gcd(b).intValue();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < gcd; i++) {
			strBuilder.append(1);
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P01850___GCD().solve();
	}
}
