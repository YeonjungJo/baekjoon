package baekjoon.solve;
import java.util.Scanner;

public class P05567___Wedding {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] friend = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			friend[a][b] = friend[b][a] = true;
		}

		boolean[] result = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (friend[0][i]) {
				result[i] = true;
				find(result, friend, i);
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (result[i]) count++;
		}
		System.out.println(count);
	}

	private void find(boolean[] result, boolean[][] friend, int n) {
		for (int i = 1; i < result.length; i++) {
			if (!result[i] && friend[n][i]) result[i] = true;
		}
	}

	public static void main(String[] args) {
		new P05567___Wedding().solve();
	}
}
