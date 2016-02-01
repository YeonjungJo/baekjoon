package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P5800____ScoreStats {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int k = sc.nextInt();
		for (int i = 1; i <= k; i++) {
			int n = sc.nextInt();
			int[] score = new int[n];
			int max = 0;
			int min = 100;
			for (int j = 0; j < n; j++) {
				int tmp = sc.nextInt();
				max = max > tmp ? max : tmp;
				min = min < tmp ? min : tmp;
				score[j] = tmp;
			}
			Arrays.sort(score);
			int diff = 0;
			for (int j = 1; j < n; j++) {
				int tmp = score[j] - score[j - 1];
				diff = tmp > diff ? tmp : diff;
			}

			System.out.println("Class " + i);
			System.out.println("Max " + max + ", Min " + min + ", Largest gap " + diff);
		}
	}

	public static void main(String[] args) {
		new P5800____ScoreStats().solve();
	}
}
