package baekjoon.solve;
import java.util.Scanner;

public class P01032___CommandPrompt {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		StringBuilder s = new StringBuilder(sc.next());
		for (int t = 1; t < testcase; t++) {
			String tmp = sc.next();
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != tmp.charAt(i)) s.deleteCharAt(i).insert(i, "?");
			}
		}
		System.out.println(s.toString());
	}

	public static void main(String[] args) {
		new P01032___CommandPrompt().solve();
	}
}
