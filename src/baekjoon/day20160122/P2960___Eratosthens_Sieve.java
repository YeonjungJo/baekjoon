package baekjoon.day20160122;
import java.util.Scanner;

public class P2960___Eratosthens_Sieve {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		boolean[] pool = new boolean[n + 1];

		while (true) {
			for (int i = 2; i <= n; i++) {
				if (!pool[i]) {
					for (int j = i; j <= n; j += i) {
						if (!pool[j]) {
							pool[j] = true;
							k--;
							if (k == 0) {
								System.out.println(j);
								return;
							}
						}

					}
				}
			}

		}
	}

	public static void main(String[] args) {
		new P2960___Eratosthens_Sieve().solve();
	}
}
