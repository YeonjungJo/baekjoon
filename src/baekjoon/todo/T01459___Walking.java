package baekjoon.todo;
import java.math.BigInteger;
import java.util.Scanner;

public class T01459___Walking {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int s = sc.nextInt();

		int m = x + y;

		if (s <= 2 * w) {
			BigInteger tmp = BigInteger.valueOf(s);
			tmp = tmp.multiply(BigInteger.valueOf(m / 2));
			if (m % 2 != 0) tmp = tmp.add(BigInteger.valueOf(w));
			System.out.println(tmp);
		} else {
			BigInteger tmp = BigInteger.valueOf(m);
			tmp = tmp.multiply(BigInteger.valueOf(w));
			System.out.println(tmp);
		}
	}

	public static void main(String[] args) {
		new T01459___Walking().solve();
	}
}
