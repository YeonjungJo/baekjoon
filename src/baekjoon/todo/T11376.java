package baekjoon.todo;

import java.util.Scanner;

public class T11376 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[] task = new boolean[m + 1];

		for (int i = 0; i < n; i++) {
			int w = sc.nextInt();
			for (int j = 0; j < w; j++) {
				int a = sc.nextInt();
				if (!task[a]) task[a] = true;
			}
		}

		int cnt = 0;

		for (int i = 1; i < m + 1; i++) {
			if (task[i]) cnt++;
		}

		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new T11376().solve();
	}
}
