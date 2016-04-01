package baekjoon.solve;
import java.util.Scanner;

public class P02947___PieceOfWood {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		boolean sorted = false;
		while (!sorted) {
			for (int i = 1; i < 5; i++) {
				if (a[i] < a[i - 1]) {
					swap(a, i - 1, i);
					sorted = check(a);
				}
			}
		}
	}

	private boolean check(int[] a) {
		StringBuilder strBuilder = new StringBuilder();
		boolean sorted = true;
		for (int i = 0; i < 5; i++) {
			strBuilder.append(a[i]).append(" ");
			if (i > 0 && a[i] < a[i - 1]) sorted = false;
		}
		System.out.println(strBuilder.toString());
		return sorted;
	}

	private void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		new P02947___PieceOfWood().solve();
	}
}
