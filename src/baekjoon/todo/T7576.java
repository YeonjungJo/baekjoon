package baekjoon.todo;
import java.util.Scanner;

public class T7576 {

	private int N;
	private int M;

	private int[][] box;

	public T7576() {
		scan();
		operate();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();

		box = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				box[i][j] = sc.nextInt();
			}
		}
	}

	private void operate() {
		boolean ripe;
		for (int day = 0; day < M + N - 1; day++) {
			ripe = true;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (box[i][j] == 0) {
						if (ripe(i, j, day + 1)) {
							box[i][j] = day + 1;
						} else {
							ripe = false;
						}
					}
				}
			}

			if (ripe) {
				System.out.println(day);
				return;
			}
		}
		System.out.println(-1);
	}

	private boolean ripe(int i, int j, int day) {
		if ((i > 0) && (box[i - 1][j] > 0) && (box[i - 1][j] < day)) return true;
		if ((j > 0) && (box[i][j - 1] > 0) && (box[i][j - 1] < day)) return true;
		if ((i < N - 1) && (box[i + 1][j] > 0) && (box[i + 1][j] < day)) return true;
		if ((j < M - 1) && (box[i][j + 1] > 0) && (box[i][j + 1] < day)) return true;
		return false;
	}

	public static void main(String[] args) {
		new T7576();
	}
}
