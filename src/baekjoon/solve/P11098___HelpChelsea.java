package baekjoon.solve;
import java.util.Scanner;

public class P11098___HelpChelsea {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int p = sc.nextInt();

			String expensivePlayer = "";
			int price = 0;

			for (int i = 0; i < p; i++) {
				int tmp = sc.nextInt();
				String player = sc.next();
				if (price < tmp) {
					price = tmp;
					expensivePlayer = player;
				}
			}
			
			System.out.println(expensivePlayer);
		}
	}

	public static void main(String[] args) {
		new P11098___HelpChelsea().solve();
	}
}
