package baekjoon.solve;
import java.util.Scanner;

public class P11637___PopularityVote {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int sum = 0;
			int max = 0;
			int winner = 0;
			for (int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				sum += tmp;
				if (max == tmp) {
					winner = 0;
				}
				if (max < tmp) {
					winner = i + 1;
					max = tmp;
				}
			}

			if (winner == 0) System.out.println("no winner");
			else {
				if (sum / 2 < max) System.out.println("majority winner " + winner);
				else System.out.println("minority winner " + winner);
			}
		}
	}

	public static void main(String[] args) {
		new P11637___PopularityVote().solve();
	}
}
