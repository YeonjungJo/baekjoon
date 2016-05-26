package baekjoon.solve;
import java.util.Scanner;

public class P02567___ColoredPaper2 {

	private static final Scanner sc = new Scanner(System.in);

	private static final int BOARD_SIZE = 100;
	private static final int PAPER_SIZE = 10;

	private void solve() {
		int n = sc.nextInt();
		boolean[][] board = new boolean[BOARD_SIZE][BOARD_SIZE];
		for (int i = 0; i < n; i++) {
			post(board, sc.nextInt(), sc.nextInt());
		}

		int circumference = 0;
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				if (board[i][j]) circumference += getCircumference(board, i, j);
			}
		}
		System.out.println(circumference);
	}

	private int getCircumference(boolean[][] board, int i, int j) {
		int result = 0;
		if (i > 0 && !board[i - 1][j]) result++;
		if (j > 0 && !board[i][j - 1]) result++;
		if (i < BOARD_SIZE - 1 && !board[i + 1][j]) result++;
		if (j < BOARD_SIZE - 1 && !board[i][j + 1]) result++;

		if (i == 0 || i == BOARD_SIZE - 1) result++;
		if (j == 0 || j == BOARD_SIZE - 1) result++;
		return result;
	}

	private void post(boolean[][] board, int x, int y) {
		for (int i = x; i < x + PAPER_SIZE; i++) {
			for (int j = y; j < y + PAPER_SIZE; j++) {
				board[i][j] = true;
			}
		}
	}

	public static void main(String[] args) {
		new P02567___ColoredPaper2().solve();
	}
}
