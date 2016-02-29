package baekjoon.todo;
import java.util.Scanner;

public class T01300___KthNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		for (int i = 1;; i++) {
			k -= findfactor(n, i);
			if (k <= 0) {
				System.out.println(i);
				return;
			}
		}
	}

	private int findfactor(int n, int a) {
		int count = 0;
		int i = a / n;
		if (a % n != 0) i++;
		for (; i <= Math.sqrt(a) && i <= n; i++) {
			if (a % i == 0) {
				if (a / i == i) count++;
				else count += 2;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		new T01300___KthNumber().solve();
	}
}
