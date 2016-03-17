package baekjoon.todo;
import java.math.BigInteger;
import java.util.Scanner;

public class T04134___NextPrimeNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			BigInteger n = sc.nextBigInteger();
			if (n.isProbablePrime(1)) System.out.println(n);
			else System.out.println(n.nextProbablePrime());
		}
	}

	public static void main(String[] args) {
		new T04134___NextPrimeNumber().solve();
	}
}
