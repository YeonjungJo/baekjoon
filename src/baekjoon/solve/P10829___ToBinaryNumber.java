package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P10829___ToBinaryNumber {

	private static final Scanner sc = new Scanner(System.in);
	
	private void solve() {
		BigInteger bi = sc.nextBigInteger();
		System.out.println(bi.toString(2));
	}

	public static void main(String[] args) {
		new P10829___ToBinaryNumber().solve();
	}
}
