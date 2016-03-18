package baekjoon.solve;
import java.util.Scanner;

public class P05046___ProgrammingContest {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < h; i++) {
			int p = sc.nextInt();
			for (int j = 0; j < w; j++) {
				if (sc.nextInt() >= n) {
					int cost = p * n;
					if (cost <= b && cost < min) min = cost;
				}
			}
		}

		if (min != Integer.MAX_VALUE) System.out.println(min);
		else System.out.println("stay home");
	}

	public static void main(String[] args) {
		new P05046___ProgrammingContest().solve();
	}
}
