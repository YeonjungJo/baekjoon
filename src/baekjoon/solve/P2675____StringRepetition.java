package baekjoon.solve;
import java.util.Scanner;

public class P2675____StringRepetition {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int r = sc.nextInt();
			String s = sc.next();
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < r; j++)
					strBuilder.append(s.charAt(i));
			}
			System.out.println(strBuilder.toString());
		}
	}

	public static void main(String[] args) {
		new P2675____StringRepetition().solve();
	}
}
