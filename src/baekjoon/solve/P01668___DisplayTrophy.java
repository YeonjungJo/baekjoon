package baekjoon.solve;
import java.util.Scanner;

public class P01668___DisplayTrophy {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] trophy = new int[n];
		for (int i = 0; i < n; i++) {
			trophy[i] = sc.nextInt();
		}

		int left = trophy[0];
		int right = trophy[n - 1];
		int countLeft = 1;
		int countRight = 1;
		for (int i = 1; i < n; i++) {
			if (left < trophy[i]) {
				countLeft++;
				left = trophy[i];
			}
			if (right < trophy[n - i - 1]) {
				countRight++;
				right = trophy[n - i - 1];
			}
		}

		System.out.println(countLeft);
		System.out.println(countRight);
	}

	public static void main(String[] args) {
		new P01668___DisplayTrophy().solve();
	}
}
