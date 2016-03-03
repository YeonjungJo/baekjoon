package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P01793___Tiling {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());

			if (n == 0) {
				System.out.println(1);
				continue;
			}

			BigInteger[] d = new BigInteger[n + 1];
			d[1] = BigInteger.ONE;
			for (int i = 2; i <= n; i++) {
				if (i % 2 == 1) d[i] = d[i - 1].multiply(BigInteger.valueOf(2)).subtract(BigInteger.ONE);
				else d[i] = d[i - 1].multiply(BigInteger.valueOf(2)).add(BigInteger.ONE);
			}

			System.out.println(d[n]);
		}
	}

	public static void main(String[] args) {
		new P01793___Tiling().solve();
	}
}
