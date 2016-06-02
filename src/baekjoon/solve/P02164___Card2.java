package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P02164___Card2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		LinkedList<Integer> card = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			card.add(i);
		}

		while (card.size() > 1) {
			card.remove();
			card.add(card.remove());
		}
		System.out.println(card.remove());
	}

	public static void main(String[] args) {
		new P02164___Card2().solve();
	}
}
