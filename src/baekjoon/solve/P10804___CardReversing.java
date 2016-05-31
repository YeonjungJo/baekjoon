package baekjoon.solve;
import java.util.Scanner;

public class P10804___CardReversing {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] card = new int[21];
		for (int i = 1; i < 21; i++) {
			card[i] = i;
		}

		for (int i = 0; i < 10; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			reverse(card, start, end);
		}

		for (int i = 1; i < 21; i++) {
			System.out.print(card[i] + " ");
		}
	}

	private void reverse(int[] card, int start, int end) {
		for (int i = 0; i <= (start + end) / 2 - start; i++) {
			int tmp = card[start + i];
			card[start + i] = card[end - i];
			card[end - i] = tmp;
		}
	}

	public static void main(String[] args) {
		new P10804___CardReversing().solve();
	}
}
