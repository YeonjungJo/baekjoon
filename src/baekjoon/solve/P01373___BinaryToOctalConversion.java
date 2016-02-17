package baekjoon.solve;
import java.util.Scanner;

public class P01373___BinaryToOctalConversion {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.nextLine();
		s = String.format("%" + (s.length() + (3 - s.length() % 3) % 3) + "s", s);

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < s.length() / 3; i++) {
			int tmp = 0;
			for (int j = 0; j < 3; j++) {
				int k = s.charAt(i * 3 + j);
				if (k == ' ') k = '0';
				tmp += Character.getNumericValue(k) * Math.pow(2, 2 - j);
			}
			strBuilder.append(tmp);
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P01373___BinaryToOctalConversion().solve();
	}
}
