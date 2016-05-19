import java.math.BigInteger;
import java.util.Scanner;

public class P02226___BinaryNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		BigInteger result = BigInteger.ZERO;
		BigInteger two = BigInteger.valueOf(2);
		for (int i = 1; i < n; i++) {
			if(i % 2 == 1) result = result.multiply(two).add(BigInteger.ONE);
			else result = result.multiply(two).subtract(BigInteger.ONE);
		}
		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		new P02226___BinaryNumber().solve();
	}
}
