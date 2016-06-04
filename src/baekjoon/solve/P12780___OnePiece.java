package baekjoon.solve;
import java.util.Scanner;

public class P12780___OnePiece {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String b = sc.next();
		System.out.println((a.length() - a.replace(b, "").length()) / b.length());
	}

	public static void main(String[] args) {
		new P12780___OnePiece().solve();
	}
}
