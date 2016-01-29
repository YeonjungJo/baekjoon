package baekjoon.day20160127;
import java.util.Scanner;

public class P2605___LineUp {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] student = new int[n];
		for (int i = 1; i <= n; i++) {
			int number = i - sc.nextInt() - 1;
			for (int k = n - 2; k >= number; k--) {
				student[k + 1] = student[k];
			}
			student[number] = i;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(student[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new P2605___LineUp().solve();
	}
}
