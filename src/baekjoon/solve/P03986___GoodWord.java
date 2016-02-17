package baekjoon.solve;
import java.util.Scanner;

public class P03986___GoodWord {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		int result = 0;
		for (int t = 0; t < testcase; t++) {
			String s = sc.next();
			while (true) {
				if (s.contains("AA") || s.contains("BB")) {
					s = s.replace("AA", "").replace("BB", "");
				} else if (s.length() == 0) {
					result++;
					break;
				} else {
					break;
				}
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P03986___GoodWord().solve();
	}
}
