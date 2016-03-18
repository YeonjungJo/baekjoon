package baekjoon.todo;
import java.math.BigInteger;
import java.util.Scanner;

public class T04948___BertrandPostulate {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;

			int i = BigInteger.valueOf(n).nextProbablePrime().intValue();
			int count = 0;
			while (i <= 2 * n) {
				count++;
				i = BigInteger.valueOf(i).nextProbablePrime().intValue();
			}

			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		new T04948___BertrandPostulate().solve();
	}
}
