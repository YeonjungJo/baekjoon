import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private static final int SIZE = 25;

	private void solve() {

		int[] fibo = new int[SIZE];
		fibo[1] = 1;
		fibo[2] = 2;
		for (int i = 3; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();

			boolean[] tmp = new boolean[SIZE];
			int l = initialize(fibo, tmp, n);

			for (int i = 0; i < SIZE; i++) {
				System.out.print(tmp[i] + " ");
			}
			System.out.println(transformation(fibo, tmp, l));
		}
	}

	private int transformation(int[] fibo, boolean[] tmp, int length) {
		int mile = 0;
		for (int i = 1; i < length; i++) {
			if (tmp[SIZE - i]) mile += fibo[SIZE - i - 1];
		}
		return mile;
	}

	private int initialize(int[] fibo, boolean[] tmp, int n) {
		int length = 0;
		for (int i = SIZE - 1; i >= 0 && n > 0; i--) {
			if (n >= fibo[i]) {
				tmp[i] = true;
				n -= fibo[i];
				if (length == 0) length = i;
			}
		}
		return length;
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
