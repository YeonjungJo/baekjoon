package baekjoon.solve;
import java.util.Scanner;

public class P01120___String {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String b = sc.next();

		int min = 50;
		for (int i = 0; i <= b.length() - a.length(); i++) {
			int tmp = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) != b.charAt(i + j)) tmp++;
			}
			min = min < tmp ? min : tmp;
		}

		System.out.println(min);
	}

	public static void main(String[] args) {
		new P01120___String().solve();
	}
}
