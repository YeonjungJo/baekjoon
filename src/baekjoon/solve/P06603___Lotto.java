package baekjoon.solve;
import java.util.Scanner;

public class P06603___Lotto {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int k = sc.nextInt();
			if (k == 0) return;
			int[] n = new int[k];
			for (int i = 0; i < k; i++) {
				n[i] = sc.nextInt();
			}

			for (int a = 0; a < k; a++) {
				for (int b = a + 1; b < k; b++) {
					for (int c = b + 1; c < k; c++) {
						for (int d = c + 1; d < k; d++) {
							for (int e = d + 1; e < k; e++) {
								for (int f = e + 1; f < k; f++) {
									System.out.printf("%d %d %d %d %d %d\n", n[a], n[b], n[c], n[d], n[e], n[f]);
								}
							}
						}
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P06603___Lotto().solve();
	}
}
