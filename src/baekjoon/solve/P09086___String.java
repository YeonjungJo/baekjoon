package baekjoon.solve;
import java.util.Scanner;

public class P09086___String {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String s = sc.next();
			System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
		}
	}

	public static void main(String[] args) {
		new P09086___String().solve();
	}
}
