package baekjoon.solve;
import java.util.Scanner;

public class P04900___SevenAdder {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] SEVEN_SEGMENT_CODE = { 63, 10, 93, 79, 106, 103, 119, 11, 127, 107 };

	private void solve() {
		while (true) {
			String[] t = sc.nextLine().split("[+|=]");
			if (t[0].equals("BYE")) return;
			int result = getInteger(t[0]) + getInteger(t[1]);
			System.out.printf("%s+%s=%s\n", t[0], t[1], toCode(result));
		}
	}

	private String toCode(int result) {
		String s = Integer.toString(result);
		StringBuilder strBuilder = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			strBuilder.append(String.format("%03d", SEVEN_SEGMENT_CODE[Character.getNumericValue(s.charAt(i))]));
		}
		return strBuilder.toString();
	}

	private int getInteger(String s) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length() / 3; i++) {
			String tmp = s.substring(i * 3, (i + 1) * 3);
			for (int j = 0; j < SEVEN_SEGMENT_CODE.length; j++) {
				if (SEVEN_SEGMENT_CODE[j] == Integer.parseInt(tmp)) {
					result.append(j);
					break;
				}
			}
		}
		return Integer.parseInt(result.toString());
	}

	public static void main(String[] args) {
		new P04900___SevenAdder().solve();
	}
}
