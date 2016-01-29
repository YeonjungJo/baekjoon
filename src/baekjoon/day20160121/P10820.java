package baekjoon.day20160121;
import java.util.Scanner;

public class P10820 {

	private static final String regexSmall = "[a-z]+";
	private static final String regexBig = "[A-Z]+";
	private static final String regexNumber = "[0-9]+";

	private void solve() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			int small = s.length() - s.replaceAll(regexSmall, "").length();
			int big = s.length() - s.replaceAll(regexBig, "").length();
			int number = s.length() - s.replaceAll(regexNumber, "").length();
			int blank = s.length() - s.replace(" ", "").length();
			System.out.println(small + " " + big + " " + number + " " + blank);
		}
	}

	public static void main(String[] args) {
		new P10820().solve();
	}
}
