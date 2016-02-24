package baekjoon.solve;
import java.util.Scanner;

public class P02965___Kangaroo {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] kangaroo = new int[3];
		for (int i = 0; i < 3; i++) {
			kangaroo[i] = sc.nextInt();
		}

		for (int i = 0;; i++) {
			if (kangaroo[1] - kangaroo[0] > kangaroo[2] - kangaroo[1]) {
				kangaroo[2] = kangaroo[1];
				kangaroo[1] = kangaroo[0] + 1;
			} else {
				kangaroo[0] = kangaroo[1];
				kangaroo[1] = kangaroo[1] + 1;
			}

//			System.out.printf("%d : %d - %d - %d\n", i, kangaroo[0], kangaroo[1], kangaroo[2]);

			if (kangaroo[0] == kangaroo[1] || kangaroo[1] == kangaroo[2]) {
				System.out.println(i);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P02965___Kangaroo().solve();
	}
}
