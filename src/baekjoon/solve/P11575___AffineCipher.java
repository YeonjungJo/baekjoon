package baekjoon.solve;
import java.util.Scanner;

public class P11575___AffineCipher {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			char[] s = sc.next().toCharArray();
			transfer(a, b, s);
		}
	}

	private void transfer(int a, int b, char[] s) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			stringBuilder.append((char) (((a * (s[i] - 'A') + b) % 26) + 'A'));
		}
		System.out.println(stringBuilder.toString());
	}

	public static void main(String[] args) {
		new P11575___AffineCipher().solve();
	}
}
