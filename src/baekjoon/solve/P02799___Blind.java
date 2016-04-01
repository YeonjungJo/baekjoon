package baekjoon.solve;
import java.util.Scanner;

public class P02799___Blind {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.next();

		int[] result = new int[5];

		for (int i = 0; i < n; i++) {
			int[] tmp = new int[m];
			for (int j = 1; j <= 4; j++) {
				String[] s = sc.next().split("#");
				for (int k = 1; k <= m; k++) {
					if (s[k].equals("****")) tmp[k - 1] = j;
				}
			}
			for (int j = 0; j < m; j++) {
				result[tmp[j]]++;
			}
			sc.next();
		}

		for (int j = 0; j < 5; j++) {
			System.out.print(result[j] + " ");
		}
	}

	public static void main(String[] args) {
		new P02799___Blind().solve();
	}
}
