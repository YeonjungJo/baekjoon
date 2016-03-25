package baekjoon.solve;
import java.util.Scanner;

public class P11727___2nTiling2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		System.out.println(search(d, n));
	}

	private int search(int[] d, int n) {
		if (n == 0) return d[n] = 0;
		if (n == 1) return d[n] = 1;
		return d[n] = (int) (search(d, n - 1) * 2 + Math.pow(-1, n)) % 10007;
	}

	public static void main(String[] args) {
		new P11727___2nTiling2().solve();
	}
}
