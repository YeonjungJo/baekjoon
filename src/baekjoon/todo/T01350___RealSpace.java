package baekjoon.todo;
import java.math.BigInteger;
import java.util.Scanner;

public class T01350___RealSpace {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] file = new int[n];
		for (int i = 0; i < n; i++) {
			file[i] = sc.nextInt();
		}
		int cluster = sc.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			float f = file[i] / (float) cluster;
			if ((int) f == f) count += f;
			else count += f + 1;
		}

		BigInteger result = new BigInteger(Integer.toString(cluster));
		System.out.println(result.multiply(BigInteger.valueOf(count)));
	}

	public static void main(String[] args) {
		new T01350___RealSpace().solve();
	}
}
