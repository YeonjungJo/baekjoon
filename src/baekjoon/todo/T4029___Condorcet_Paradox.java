package baekjoon.todo;
import java.util.Scanner;

public class T4029___Condorcet_Paradox {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		for (int k = 1;; k++) {
			int voter = sc.nextInt();
			int candidate = sc.nextInt();
			if (voter == 0 && candidate == 0) return;

			int[] result = new int[candidate];

			for (int i = 0; i < voter; i++) {
				for (int j = 0; j < candidate; j++) {
					result[sc.nextInt()] += candidate - j - 1;
				}
			}

			int max = result[0];
			int winner = 0;

			for (int i = 1; i < candidate; i++) {
				if (max < result[i]) {
					max = result[i];
					winner = i;
				} else if (max == result[i]) {
					max = result[i];
					winner = -1;
				}
			}

			System.out.print("Case " + k + ": ");
			if (winner != -1) System.out.println(winner);
			else System.out.println("No Condorcet winner");
		}
	}

	public static void main(String[] args) {
		new T4029___Condorcet_Paradox().solve();
	}
}
