package baekjoon.solve;
import java.util.Scanner;

public class P1543____DocumentRetrieval {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println((a.length() - a.replace(b, "").length()) / b.length());
	}

	public static void main(String[] args) {
		new P1543____DocumentRetrieval().solve();
	}
}
