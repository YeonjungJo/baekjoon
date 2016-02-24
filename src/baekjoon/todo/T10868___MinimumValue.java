package baekjoon.todo;
import java.util.Scanner;

public class T10868___MinimumValue {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] d = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int min = 1000000000;
			for (int j = a; j <= b; j++) {
				min = d[j] > min ? min : d[j];
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new T10868___MinimumValue().solve();
	}
}
