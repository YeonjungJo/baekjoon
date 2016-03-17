package baekjoon.solve;
import java.util.Scanner;

public class P10942___Palindrom {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			System.out.println(palindrom(s, start, end) ? 1 : 0);
		}
	}

	private boolean palindrom(String[] s, int start, int end) {
		for (int i = 0; i <= (end - start) / 2; i++) {
			if (!s[start + i].equals(s[end - i])) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P10942___Palindrom().solve();
	}
}
