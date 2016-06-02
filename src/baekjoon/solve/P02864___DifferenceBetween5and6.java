package baekjoon.solve;
import java.util.Scanner;

public class P02864___DifferenceBetween5and6 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String b = sc.next();

		System.out.printf("%d %d", sum(a.replaceAll("6", "5"), b.replaceAll("6", "5")), sum(a.replaceAll("5", "6"), b.replaceAll("5", "6")));
	}

	private int sum(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}

	public static void main(String[] args) {
		new P02864___DifferenceBetween5and6().solve();
	}
}
