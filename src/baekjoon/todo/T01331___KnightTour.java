package baekjoon.todo;
import java.util.Scanner;

public class T01331___KnightTour {

	private static final Scanner sc = new Scanner(System.in);

	private static final String CHESS = "ABCDEF";

	private void solve() {
		boolean[][] chess = new boolean[6][6];
		int[] before = new int[2];
		before[0] = before[1] = -1;
		int[] start = new int[2];

		for (int i = 0; i < 36; i++) {
			int[] next = get(sc.next());
			if (i == 0) start = next;
			if (chess[next[0]][next[1]] || before[0] == next[0] || before[1] == next[1] || (i != 0 && getDistance(before, next) != 3)) {
				System.out.println("Invalid");
				return;
			}
			chess[next[0]][next[1]] = true;
			before = next;
		}
		if (before[0] == start[0] || before[1] == start[1] || getDistance(before, start) != 3) {
			System.out.println("Invalid");
		} else {
			System.out.println("Valid");
		}
	}

	private int[] get(String s) {
		int[] next = new int[2];
		next[0] = CHESS.indexOf(s.charAt(0));
		next[1] = Character.getNumericValue(s.charAt(1)) - 1;
		return next;
	}

	private int getDistance(int[] a, int[] b) {
		return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
	}

	public static void main(String[] args) {
		new T01331___KnightTour().solve();
	}
}
