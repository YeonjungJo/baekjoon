package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P09660___StoneGame6 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String[] winner = { "CY", "SK", "CY", "SK", "SK", "SK", "SK" };
		System.out.println(winner[sc.nextBigInteger().remainder(BigInteger.valueOf(7)).intValue()]);
	}

	public static void main(String[] args) {
		new P09660___StoneGame6().solve();
	}
}
