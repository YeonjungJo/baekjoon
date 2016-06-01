package baekjoon.solve;
import java.util.Scanner;

public class P06504___KilometerToMile {

	private static final Scanner sc = new Scanner(System.in);

	private static final int SIZE = 25;

	private void solve() {
		int[] fibo = new int[SIZE];
		fibo[SIZE - 2] = 1;
		fibo[SIZE - 3] = 2;
		for (int i = SIZE - 4; i >= 0; i--) {
			fibo[i] = fibo[i + 1] + fibo[i + 2];
		}

		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();

			boolean[] tmp = new boolean[SIZE];
			initialize(fibo, tmp, n);
			int mile = transformation(fibo, tmp);
			System.out.println(mile);
		}
	}

	private int transformation(int[] fibo, boolean[] tmp) {
		int mile = 0;
		for (int i = 0; i < SIZE - 2; i++) {
			if (tmp[i]) mile += fibo[i + 1];
		}
		return mile;
	}

	private int initialize(int[] fibo, boolean[] tmp, int n) {
		int length = 0;
		for (int i = 0; i < SIZE - 1 && n > 0; i++) {
			if (n >= fibo[i]) {
				tmp[i] = true;
				n -= fibo[i];
				if (length == 0) length = i;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		new P06504___KilometerToMile().solve();
	}
}
