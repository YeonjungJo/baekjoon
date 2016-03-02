package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P01500___MaxMultiply {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int s = sc.nextInt();
		int k = sc.nextInt();

		BigInteger mul = BigInteger.ONE;
		for (; k > 0; k--) {
			int tmp = s / k;
			mul = mul.multiply(BigInteger.valueOf(tmp));
			s -= tmp;
		}
		
		System.out.println(mul.toString());
	}

	public static void main(String[] args) {
		new P01500___MaxMultiply().solve();
	}
}
