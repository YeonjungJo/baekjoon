package baekjoon.todo;
import java.util.Scanner;

public class T10263___Opening {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[1000001];
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp <= n) d[tmp]++;
		}

		int sum = 0;
		int a = 0;
		int b = 0;
		for (int i = 1; i <= n; i++) {
			sum += d[i];
			if (d[i] != 0 && sum > i) {
				a = sum;
				b = i;
			}
		}

		System.out.println(n - a + b);
	}

	public static void main(String[] args) {
		new T10263___Opening().solve();
	}
}
