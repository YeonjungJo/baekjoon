package baekjoon.day20160121;
import java.util.Scanner;

public class P11816 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.startsWith("0x")) toDec(s.substring(2), 16);
		else if (s.startsWith("0")) toDec(s.substring(1), 8);
		else System.out.println(s);
	}

	private void toDec(String s, int original) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result += Character.getNumericValue(s.charAt(i)) * Math.pow(original, s.length() - i -1);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P11816().solve();
	}
}
