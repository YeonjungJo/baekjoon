package baekjoon.solve;
import java.util.Scanner;

public class P10163___ColoredPaper {

	private static final Scanner sc = new Scanner(System.in);

	private static int[][] bg = new int[101][101];

	private void solve() {
		int n = sc.nextInt();
		int[] result = new int[n + 1];

		for (int t = 1; t <= n; t++) {
			put(t, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				result[bg[i][j]]++;
			}
		}

		for (int i = 1; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private void put(int n, int leftX, int leftY, int w, int h) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				bg[leftY + i][leftX + j] = n;
			}
		}
	}

	public static void main(String[] args) {
		new P10163___ColoredPaper().solve();
	}
}
