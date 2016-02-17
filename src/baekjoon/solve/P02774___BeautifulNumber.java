package baekjoon.solve;
import java.util.Scanner;

public class P02774___BeautifulNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			boolean[] beauty = new boolean[10];
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				beauty[Integer.parseInt(s.substring(i, i + 1))] = true;
			}

			int cnt = 0;
			for (int i = 0; i < 10; i++) {
				if (beauty[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new P02774___BeautifulNumber().solve();
	}
}
