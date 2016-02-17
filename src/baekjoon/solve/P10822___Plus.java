package baekjoon.solve;

import java.util.Scanner;

public class P10822___Plus {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String[] input = sc.nextLine().split(",");
		int result = 0;
		for (int i = 0; i < input.length; i++) {
			result += Integer.parseInt(input[i]);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P10822___Plus().solve();
	}
}
