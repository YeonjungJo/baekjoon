package baekjoon.solve;
import java.util.Scanner;

public class P10471___MakeSpace {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int w = sc.nextInt();
		int p = sc.nextInt();
		int[] a = new int[p + 2];
		a[0] = 0;
		a[p + 1] = w;

		for (int i = 1; i <= p; i++) {
			a[i] = sc.nextInt();
		}

		boolean[] space = new boolean[w + 1];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				space[a[j] - a[i]] = true;
			}
		}

		for (int i = 1; i <= w; i++) {
			if (space[i]) System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		new P10471___MakeSpace().solve();
	}
}
