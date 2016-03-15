package baekjoon.solve;
import java.util.Scanner;

public class P01547___Ball {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int b = 1;

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			b = swap(b, sc.nextInt(), sc.nextInt());
		}

		System.out.println(b);
	}

	private int swap(int b, int i, int j) {
		if (i == b) return j;
		if (j == b) return i;
		return b;
	}

	public static void main(String[] args) {
		new P01547___Ball().solve();
	}
}
