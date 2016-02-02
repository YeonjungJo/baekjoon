package baekjoon.solve;
import java.util.Scanner;

public class P3028____ChangYoungVillage {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		boolean[] cup = new boolean[3];
		cup[0] = true;

		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'A':
				swap(cup, 0, 1);
				break;
			case 'B':
				swap(cup, 1, 2);
				break;
			case 'C':
				swap(cup, 0, 2);
				break;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (cup[i]) System.out.println(i + 1);
		}
	}

	private void swap(boolean[] cup, int i, int j) {
		boolean tmp = cup[i];
		cup[i] = cup[j];
		cup[j] = tmp;
	}

	public static void main(String[] args) {
		new P3028____ChangYoungVillage().solve();
	}
}
