package baekjoon.todo;
import java.util.Scanner;

public class T01822___DifferenceSet {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		StringBuilder strBuilder = new StringBuilder(" ");

		for (int i = 0; i < n; i++) {
			strBuilder.append(sc.next() + " ");
		}

		String a = strBuilder.toString();

		for (int i = 0; i < m; i++) {
			String s = " " + sc.next() + " ";
			a = a.replaceAll(s, " ");
		}

		if (a.trim().length() == 0) System.out.println(0);
		else {
			System.out.println(a.split(" ").length);
			System.out.println(a.substring(1));
		}
	}

	public static void main(String[] args) {
		new T01822___DifferenceSet().solve();
	}
}
