package baekjoon.solve;
import java.util.Scanner;

public class P05988___EvenOdd {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String s = sc.next();
			System.out.println(Character.getNumericValue(s.charAt(s.length() - 1)) % 2 == 0 ? "even" : "odd");
		}
	}

	public static void main(String[] args) {
		new P05988___EvenOdd().solve();
	}
}
