package baekjoon.solve;
import java.util.Scanner;

public class P01463___Make1 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[n + 1];

		for (int i = n; i > 1; i--) {
			if (i % 3 == 0 && (d[i / 3] == 0 || d[i] + 1 < d[i / 3])) d[i / 3] = d[i] + 1;
			if (i % 2 == 0 && (d[i / 2] == 0 || d[i] + 1 < d[i / 2])) d[i / 2] = d[i] + 1;
			if (d[i - 1] == 0 || d[i] + 1 < d[i - 1]) d[i - 1] = d[i] + 1;
		}

		System.out.println(d[1]);
	}

	public static void main(String[] args) {
		new P01463___Make1().solve();
	}
}
