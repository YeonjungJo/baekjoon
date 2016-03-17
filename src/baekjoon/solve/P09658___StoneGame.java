package baekjoon.solve;
import java.util.Scanner;

public class P09658___StoneGame {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NULL = 0;
	private static final int WIN = 1;
	private static final int LOSE = 2;

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		System.out.println(search(d, n) == WIN ? "SK" : "CY");
	}

	private int search(int[] d, int n) {
		if (n <= 0) return NULL;
		if (d[n] != NULL) return d[n];
		if (n == 1) return d[n] = LOSE;
		return d[n] = (search(d, n - 1) != LOSE && search(d, n - 3) != LOSE && search(d, n - 4) != LOSE) ? LOSE : WIN;
	}

	public static void main(String[] args) {
		new P09658___StoneGame().solve();
	}
}
