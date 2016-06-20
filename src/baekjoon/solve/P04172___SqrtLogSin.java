package baekjoon.solve;
import java.util.Scanner;

public class P04172___SqrtLogSin {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] a = new int[1000001];
		a[0] = 1;
		for (int i = 1; i < 1000001; i++) {
			a[i] = (a[(int) (i - Math.sqrt(i))] + a[(int) Math.log(i)] + a[(int) (i * Math.sin(i) * Math.sin(i))]) % 1000000;
		}

		while (true) {
			int n = sc.nextInt();
			if (n == -1) return;
			System.out.println(a[n]);
		}
	}

	public static void main(String[] args) {
		new P04172___SqrtLogSin().solve();
	}
}
