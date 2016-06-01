package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P02161___Card1 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		LinkedList<Integer> card = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			card.add(i);
		}

		while (card.size() != 1) {
			System.out.println(card.removeFirst());
			card.add(card.removeFirst());
		}
		System.out.println(card.removeFirst());
	}

	public static void main(String[] args) {
		new P02161___Card1().solve();
	}
}
