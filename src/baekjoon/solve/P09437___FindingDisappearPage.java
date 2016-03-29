package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P09437___FindingDisappearPage {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) return;
			int p = sc.nextInt();

			int[] page = new int[3];
			if (p % 2 == 0) {
				page[0] = p - 1;
				int i = p / 2 - 1;
				page[1] = n - 2 * i;
				page[2] = page[1] - 1;
			} else {
				page[0] = p + 1;
				int i = p / 2;
				page[1] = n - 2 * i;
				page[2] = page[1] - 1;
			}

			Arrays.sort(page);
			System.out.printf("%d %d %d\n", page[0], page[1], page[2]);
		}
	}

	public static void main(String[] args) {
		new P09437___FindingDisappearPage().solve();
	}
}
