package baekjoon.solve;
import java.util.Scanner;

public class P04597___ParityBit {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			String s = sc.next();
			if (s.equals("#")) return;

			int cnt = s.length() - s.replaceAll("1", "").length();
			
			if (s.charAt(s.length() - 1) == 'o' && cnt % 2 == 0) System.out.println(s.replaceAll("o", "1"));
			if (s.charAt(s.length() - 1) == 'o' && cnt % 2 == 1) System.out.println(s.replaceAll("o", "0"));
			if (s.charAt(s.length() - 1) == 'e' && cnt % 2 == 0) System.out.println(s.replaceAll("e", "0"));
			if (s.charAt(s.length() - 1) == 'e' && cnt % 2 == 1) System.out.println(s.replaceAll("e", "1"));
		}
	}

	public static void main(String[] args) {
		new P04597___ParityBit().solve();
	}
}
