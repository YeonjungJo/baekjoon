package baekjoon.todo;
import java.util.Scanner;

public class T2357____MinNMax {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] data = new long[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextLong();
		}
		for (int i = 0; i < m; i++) {
			long min = 1000000000;
			long max = -1;
			int start = sc.nextInt() - 1;
			int stop = sc.nextInt() - 1;
			for (int j = start; j <= stop; j++) {
				if (data[j] < min) min = data[j];
				if (data[j] > max) max = data[j];
			}
			System.out.println(min + " " + max);
		}
	}

	public static void main(String[] args) {
		new T2357____MinNMax().solve();
	}
}
