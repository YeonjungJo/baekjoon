package baekjoon.todo;

import java.util.Scanner;

public class T02343___GuitarLesson {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NOT_AVAILABLE = 1000000000;

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] lesson = new int[n];
		for (int i = 0; i < n; i++) {
			lesson[i] = sc.nextInt();
		}

		int[][] d = new int[n][m];
		System.out.println(search(d, lesson, n, m, 0, 0, 0, 0));
	}

	private int search(int[][] d, int[] lesson, int n, int m, int k, int record, int sum, int min) {
		if (k >= n) return NOT_AVAILABLE;

		if (d[k][record] != 0 && d[k][record] < min) return d[k][record];

		if (record == m - 1) {
			if (k == n - 1) return d[k][record] = max(lesson[k] + sum, min);
			return d[k][record] = search(d, lesson, n, m, k + 1, record, sum + lesson[k], min);
		}

		return d[k][record] = min(search(d, lesson, n, m, k + 1, record + 1, 0, max(sum + lesson[k], min)), search(d, lesson, n, m, k + 1, record, sum + lesson[k], min));
	}

	private int max(int i, int j) {
		return i > j ? i : j;
	}

	private int min(int i, int j) {
		return i < j ? i : j;
	}

	public static void main(String[] args) {
		new T02343___GuitarLesson().solve();
	}
}
