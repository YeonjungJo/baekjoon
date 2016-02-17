package baekjoon.solve;
import java.util.Scanner;

public class P02553___LastFactorialNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int result = 1;
		for (int i = 2; i <= n; i++) {
			String tmp = Integer.toString(result * i).replaceAll("[0]+$", "");
			result = Integer.parseInt(tmp.length() >= 5 ? tmp.substring(tmp.length() - 5) : tmp);
		}
		System.out.println(result % 10);
	}

	public static void main(String[] args) {
		new P02553___LastFactorialNumber().solve();
	}
}
