package baekjoon.solve;
import java.util.Scanner;

public class P09325___HowMuch {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int s = sc.nextInt();
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				s += sc.nextInt() * sc.nextInt();
			}
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new P09325___HowMuch().solve();
	}
}
