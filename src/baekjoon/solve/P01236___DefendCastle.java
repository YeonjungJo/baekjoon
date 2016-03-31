package baekjoon.solve;
import java.util.Scanner;

public class P01236___DefendCastle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] a = new char[n][m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}

		boolean[] r = new boolean[n];
		boolean[] c = new boolean[m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 'X') {
					r[i] = true;
					c[j] = true;
				}
			}
		}

		int cntR = 0;
		for (int i = 0; i < n; i++) {
			if (!r[i]) cntR++;
		}
		int cntC = 0;
		for (int i = 0; i < m; i++) {
			if (!c[i]) cntC++;
		}
		
		System.out.println(cntR > cntC ? cntR : cntC);
	}

	public static void main(String[] args) {
		new P01236___DefendCastle().solve();
	}
}
