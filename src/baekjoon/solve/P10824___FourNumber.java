package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P10824___FourNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		BigInteger ab = new BigInteger(sc.next() + sc.next());
		BigInteger cd = new BigInteger(sc.next() + sc.next());
		System.out.println(ab.add(cd));
	}

	public static void main(String[] args) {
		new P10824___FourNumber().solve();
	}
}
