package baekjoon.solve;
import java.util.Scanner;

public class P05176___RoomForChampionship {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int p = sc.nextInt();
			int m = sc.nextInt();
			boolean[] d = new boolean[m];
			for (int i = 0; i < p; i++) {
				d[sc.nextInt() - 1] = true;
			}
			for (int i = 0; i < m; i++) {
				if (d[i]) p--;
			}
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		new P05176___RoomForChampionship().solve();
	}
}
