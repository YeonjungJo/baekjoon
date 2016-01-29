package baekjoon.todo;

import java.util.Scanner;

public class T2512___Budget {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] area = new int[n];

		int t = 0;

		for (int i = 0; i < n; i++) {
			area[i] = sc.nextInt();
			t += area[i];
		}

		int total = sc.nextInt();

		int max = 0;
		if (t <= total) {
			for (int i = 0; i < n; i++) {
				max = max < area[i] ? area[i] : max;
			}
			System.out.println(max);
		} else {

			int budget = total / n;

			int remain = 0;
			int count = 0;

			for (int i = 0; i < n; i++) {
				if (budget >= area[i]) remain += budget - area[i];
				else count++;
			}

			System.out.println(budget + (remain / count));
		}
	}

	public static void main(String[] args) {
		new T2512___Budget().solve();
	}
}
