package baekjoon.todo;

import java.util.Scanner;

public class T01055___Endless {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String s = sc.next();
		int n = sc.nextInt();
		int start = sc.nextInt() - 1;
		int end = sc.nextInt() - 1;

		for (int i = 0; i < n; i++) {
			a = next(s, a);
			if (a.length() >= end) {
				print(a, start, end);
				return;
			}
		}

		print(a, start, end);
	}

	private void print(String a, int start, int end) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = start; i <= end; i++) {
			strBuilder.append("-");
		}
		if (start > a.length()) System.out.println(strBuilder.toString());
		else {
			strBuilder.insert(0, a.substring(start));
			System.out.println(strBuilder.toString().substring(0, end - start + 1));
		}
	}

	private String next(String s, String a) {
		return s.replace("$", a);
	}

	public static void main(String[] args) {
		new T01055___Endless().solve();
	}
}
