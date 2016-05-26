package baekjoon.todo;
import java.util.Scanner;

public class T02981___Check {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int min = 1000000000;
		int max = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (min > a[i]) min = a[i];
			if (max < a[i]) max = a[i];
		}

		boolean[] result = new boolean[max];
		for (int remainder = 0; remainder <= min; remainder++) {
			getResult(result, remainder, a);
		}

		for (int i = 0; i < result.length; i++) {
			if(result[i]) System.out.print(i + " ");
		}
	}

	private void getResult(boolean[] result, int remainder, int[] a) {
		for (int i = 2; i < result.length; i++) {
			if (!result[i] && isFactor(a, remainder, i)) result[i] = true;
		}
	}

	private boolean isFactor(int[] a, int remainder, int i) {
		for (int j = 0; j < a.length; j++) {
			if ((a[j] - remainder) % i != 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new T02981___Check().solve();
	}
}
