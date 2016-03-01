package baekjoon.todo;
import java.util.Scanner;

public class T10942___Palindrom {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(palindrom(s, start, end) ? 1 : 0);
		}
	}

	private boolean palindrom(String[] s, int start, int end) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = start - 1; i < end; i++) {
			strBuilder.append(s[i]);
		}
		for (int i = 0; i < strBuilder.length(); i++) {
			if (strBuilder.charAt(i) != strBuilder.charAt(strBuilder.length() - i - 1)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new T10942___Palindrom().solve();
	}
}
