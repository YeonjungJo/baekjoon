package baekjoon.solve;
import java.util.Scanner;

public class P09659___StoneGame5 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		System.out.println(Character.getNumericValue(s.charAt(s.length() - 1)) % 2 == 0 ? "CY" : "SK");
	}

	public static void main(String[] args) {
		new P09659___StoneGame5().solve();
	}
}
