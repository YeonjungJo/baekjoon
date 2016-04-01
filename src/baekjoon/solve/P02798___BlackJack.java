package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P02798___BlackJack {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] card = new int[n];
		for (int i = 0; i < n; i++) {
			card[i] = sc.nextInt();
		}

		Arrays.sort(card);
		int diff = m;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = card[i] + card[j];
				int tmp = search(card, sum, m, j + 1, n - 1);
				if (tmp == 0) continue;
				if (m - (tmp + sum) < diff) diff = m - (tmp + sum);
			}
		}
		System.out.println(m - diff);
	}

	private int search(int[] card, int sum, int m, int start, int end) {
		if (sum >= m) return 0;
		if (start > end) return 0;
		int k = (start + end) / 2;
		if (sum + card[k] > m) return search(card, sum, m, start, k - 1);
		if (sum + card[k] == m) return card[k];
		if (k == card.length - 1 || sum + card[k + 1] > m) return card[k];
		return search(card, sum, m, k + 1, end);
	}

	public static void main(String[] args) {
		new P02798___BlackJack().solve();
	}
}
