package baekjoon.solve;
import java.util.Scanner;

public class P11213___BlackFriday {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] d = new int[7];
		int[] idx = new int[7];
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			d[tmp]++;
			idx[tmp] = i;
		}
		for (int i = d.length - 1; i > 0; i--) {
			if (d[i] == 1) {
				System.out.println(idx[i] + 1);
				return;
			}
		}
		System.out.println("none");
	}

	public static void main(String[] args) {
		new P11213___BlackFriday().solve();
	}
}
