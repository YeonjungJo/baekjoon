package baekjoon.solve;

import java.util.Scanner;

public class P10823___Plus2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		StringBuilder input = new StringBuilder();
		while (sc.hasNext()) {
			input.append(sc.next());
		}
		String[] number = input.toString().split(",");
		int result = 0;
		for (int i = 0; i < number.length; i++) {
			result += Integer.parseInt(number[i]);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P10823___Plus2().solve();
	}
}
