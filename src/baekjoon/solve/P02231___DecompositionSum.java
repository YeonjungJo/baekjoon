package baekjoon.solve;
import java.util.Scanner;

public class P02231___DecompositionSum {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int tmp = i;
			int sum = i;
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			if (sum == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	public static void main(String[] args) {
		new P02231___DecompositionSum().solve();
	}
}
