package baekjoon.todo;
import java.util.Arrays;
import java.util.Scanner;

public class T02981___Check_2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		for (int m = 2; m < a[0]; m++) {
			int remainer = a[0] % m;
			if (check(a, n, remainer, m)) System.out.print(m + " ");
		}

		for (int i = 1; i * a[0] <= a[1] - a[0]; i++) {
			if (check(a, n, a[0], i * a[0])) System.out.print(i * a[0] + " ");
		}
	}

	private boolean check(int[] a, int n, int m, int i) {
		for (int j = 1; j < a.length; j++) {
			if (a[j] % i != m) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new T02981___Check_2().solve();
	}
}
