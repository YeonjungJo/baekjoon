package baekjoon.solve;
import java.util.Scanner;

public class P02872___HaveLibrary {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int t = sc.nextInt();

		int[] a = new int[t + 1];
		for (int i = 1; i <= t; i++) {
			a[sc.nextInt()] = i;
		}

		int count = 0;
		int before = a[t];
		for (int i = t - 1; i > 0; i--) {
			if (a[i] > before) {
				count++;
				before = 0;
			} else before = a[i];
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new P02872___HaveLibrary().solve();
	}
}
