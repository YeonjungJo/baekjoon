package baekjoon.solve;
import java.util.Scanner;

public class P11008___MasterOfCopyPaste {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String s = sc.next();
			String p = sc.next();

			String tmp = s.replace(p, "");

			int cp = (s.length() - tmp.length()) / p.length();
			System.out.println(cp + s.length() - (cp * p.length()));
		}
	}

	public static void main(String[] args) {
		new P11008___MasterOfCopyPaste().solve();
	}
}
