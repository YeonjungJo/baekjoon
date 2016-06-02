package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P02090___HarmonicMean {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		long a = 1;
		long b = d[0];
		for (int i = 1; i < n; i++) {
			long[] sum = add(a, b, 1, d[i]);
			long[] simple = reduct(sum[0], sum[1]);
			a = simple[0];
			b = simple[1];
		}

		// if (a == 1) System.out.println(b);
		System.out.printf("%d/%d\n", b, a);
	}

	private long[] reduct(long a, long b) {
		long gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
		long[] result = { a / gcd, b / gcd };
		return result;
	}

	private long[] add(long a, long b, long c, long d) {
		long[] result = { a * d + b * c, b * d };
		return result;
	}

	public static void main(String[] args) {
		new P02090___HarmonicMean().solve();
	}
}
