package baekjoon.solve;
import java.util.Scanner;

public class P06359___DrunkenSangBum {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			boolean[] room = new boolean[n + 1];
			for (int i = 2; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j % i == 0) room[j] = !room[j];
				}
			}

			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				if (!room[j]) cnt++;
			}

			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new P06359___DrunkenSangBum().solve();
	}
}
