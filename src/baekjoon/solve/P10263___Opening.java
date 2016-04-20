package baekjoon.solve;
import java.util.Scanner;

public class P10263___Opening {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[1000001];
		for (int i = 0; i < n; i++) {
			a[sc.nextInt()]++;
		}

		int min = n;
		int tmp = n;
		for (int i = 1; i < a.length; i++) {
			tmp = tmp + 1 - a[i];
			if (tmp < min) min = tmp;
		}

		System.out.println(min);
	}

	public static void main(String[] args) {
		new P10263___Opening().solve();
	}
}
