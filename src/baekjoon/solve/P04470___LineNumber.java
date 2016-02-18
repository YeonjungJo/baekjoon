package baekjoon.solve;
import java.util.Scanner;

public class P04470___LineNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 1; t <= testcase; t++) {
			System.out.printf("%d. %s\n", t, sc.nextLine());
		}
	}

	public static void main(String[] args) {
		new P04470___LineNumber().solve();
	}
}
