package baekjoon.solve;
import java.util.Scanner;

public class P09655___StoneGame {

	private static final Scanner sc = new Scanner(System.in);

	private static final int WIN = 1;
	private static final int LOSE = 2;

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[n + 2];
		System.out.println(search(d, n + 1, 1) == 1 ? "CY" : "SK");
	}

	private int search(int[] d, int n, int i) {
		if (n < 1) return 0;
		if (n == 3 || n == 1) return d[n] = WIN;
		if (n == 2) return d[n] = LOSE;
		if (d[n] != 0) return d[n];

		int a = search(d, n - i, 1);
		int b = search(d, n - i, 3);

		return d[n] = (a == LOSE || b == LOSE) ? WIN : LOSE;
	}

	public static void main(String[] args) {
		new P09655___StoneGame().solve();
	}
}
