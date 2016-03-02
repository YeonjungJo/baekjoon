package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P01094___Stick {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = BigInteger.valueOf(sc.nextLong()).toString(2);
		System.out.println(s.length() - s.replaceAll("1", "").length());
	}

	public static void main(String[] args) {
		new P01094___Stick().solve();
	}
}
