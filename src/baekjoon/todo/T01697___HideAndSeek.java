package baekjoon.todo;
import java.util.Scanner;

public class T01697___HideAndSeek {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MAX_VALUE = 100000;

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] d = new int[MAX_VALUE + 1];
		search(d, k, n, 0);
		System.out.println(d[k]);
	}

	private void search(int[] d, int k, int n, int cost) {
		System.out.println(n);
		if (n < 0 || n >= MAX_VALUE) return;
		if (d[n] != 0 && d[n] <= cost) return;
		d[n] = cost;
		if (n == k) return;
		search(d, k, n - 1, cost + 1);
		if (n < k) {
			search(d, k, 2 * n, cost + 1);
			search(d, k, n + 1, cost + 1);
		}
	}

	public static void main(String[] args) {
		new T01697___HideAndSeek().solve();
	}
}
