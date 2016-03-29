package baekjoon.solve;
import java.util.Scanner;

public class P07513___ProgrammingContest {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int m = sc.nextInt();
			String[] word = new String[m];
			for (int i = 0; i < m; i++) {
				word[i] = sc.next();
			}
			int n = sc.nextInt();

			System.out.printf("Scenario #%d:\n", t);

			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				StringBuilder strBuilder = new StringBuilder();
				for (int j = 0; j < k; j++) {
					strBuilder.append(word[sc.nextInt()]);
				}
				System.out.println(strBuilder.toString());
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P07513___ProgrammingContest().solve();
	}
}
