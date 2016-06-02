package baekjoon.solve;
import java.util.Scanner;

public class P02684___CoinGame {

	private static final Scanner sc = new Scanner(System.in);

	private static final int SEQUENCE_SIZE = 8;
	private static final int RESULT_SIZE = 40;
	private static final int SUBSEQUENCE_SIZE = 3;

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int[] sequence = new int[SEQUENCE_SIZE];

			String s = sc.next().replaceAll("T", "0").replaceAll("H", "1");
			for (int i = 0; i < RESULT_SIZE - 2; i++) {
				String tmp = s.substring(i, i + SUBSEQUENCE_SIZE);
				sequence[getIndex(tmp)]++;
			}

			for (int i = 0; i < SEQUENCE_SIZE; i++) {
				System.out.print(sequence[i] + " ");
			}
			System.out.println();
		}
	}

	private int getIndex(String tmp) {
		int result = 0;
		for (int i = 0; i < SUBSEQUENCE_SIZE; i++) {
			result += Character.getNumericValue(tmp.charAt(i)) * Math.pow(2, SUBSEQUENCE_SIZE - i - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		new P02684___CoinGame().solve();
	}
}
