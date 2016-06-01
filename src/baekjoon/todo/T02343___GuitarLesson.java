package baekjoon.todo;
import java.util.Scanner;

public class T02343___GuitarLesson {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MAX_VALUE = 1000000000;

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] lesson = new int[n];
		for (int i = 0; i < n; i++) {
			lesson[i] = sc.nextInt();
		}

		System.out.println(search(lesson, n, m, 0, 1, 0, 0));
	}

	private int search(int[] lesson, int n, int m, int idx, int bluelayIndex, int sum, int min) {
		if (bluelayIndex > m) return MAX_VALUE;
		if (idx == n - 1) {
			if (bluelayIndex == m) return max(lesson[idx] + sum, min);
			return MAX_VALUE;
		}
		return min(search(lesson, n, m, idx + 1, bluelayIndex, sum + lesson[idx], min), search(lesson, n, m, idx + 1, bluelayIndex + 1, 0, max(sum + lesson[idx], min)));
	}

	private int min(int a, int b) {
		return a > b ? b : a;
	}

	private int max(int a, int b) {
		return a < b ? b : a;
	}

	public static void main(String[] args) {
		new T02343___GuitarLesson().solve();
	}
}
