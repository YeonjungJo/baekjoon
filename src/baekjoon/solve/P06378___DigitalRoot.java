package baekjoon.solve;
import java.util.Scanner;

public class P06378___DigitalRoot {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			String s = sc.next();
			if (s.equals("0")) return;
			get(s);
		}
	}

	private void get(String n) {
		char[] s = n.toCharArray();
		int k = 0;
		for (int i = 0; i < s.length; i++) {
			k += Character.getNumericValue(s[i]);
		}
		if (k < 10) {
			System.out.println(k);
			return;
		}
		get(Integer.toString(k));
	}

	public static void main(String[] args) {
		new P06378___DigitalRoot().solve();
	}
}
