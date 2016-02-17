package baekjoon.solve;
import java.util.Scanner;

public class P02303___NumberGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int winner = -1;
		int max = 0;
		for (int i = 1; i <= n; i++) {
			int[] card = new int[5];
			for (int k = 0; k < 5; k++)
				card[k] = sc.nextInt();
			
			int point = findMaxPoint(card);
			if (max <= point) {
				winner = i;
				max = point;
			}
		}

		System.out.println(winner);
	}

	private int findMaxPoint(int[] card) {
		int max = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					int tmp = (card[i] + card[j] + card[k]) % 10;
					max = tmp > max ? tmp : max;
					if (max == 9) return max;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		new P02303___NumberGame().solve();
	}
}
