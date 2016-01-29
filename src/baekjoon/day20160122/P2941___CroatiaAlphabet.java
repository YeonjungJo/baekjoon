package baekjoon.day20160122;
import java.util.Scanner;

public class P2941___CroatiaAlphabet {

	private static final String[] CROATIA = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

	private void solve() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count = 0;
		for (int i = 0; i < CROATIA.length; i++) {
			String tmp = input.replaceAll(CROATIA[i], "");
			count += (input.length() - tmp.length()) / CROATIA[i].length();
			input = tmp;
		}
		System.out.println(count + input.length());
	}

	public static void main(String[] args) {
		new P2941___CroatiaAlphabet().solve();
	}
}
