package baekjoon.solve;
import java.util.Scanner;

public class T02290___LCDTest {

	private static final Scanner sc = new Scanner(System.in);

	private static final boolean[][] SEGMENT = { { true, true, true, false, true, true, true, true }, { false, false, true, false, false, true, false, false },
			{ true, false, true, true, true, false, true, true }, { true, false, true, true, false, true, true, true }, { false, true, true, true, false, true, false, true },
			{ true, true, false, true, false, true, true, true }, { true, true, false, true, true, true, true, true }, { true, false, true, false, false, true, false, true },
			{ true, true, true, true, true, true, true, true }, { true, true, true, true, false, true, true, true } };

	private void solve() {
		int n = sc.nextInt();
		String s = sc.next();

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			strBuilder.append(" ");
			String seg = SEGMENT[Character.getNumericValue(s.charAt(i))][0] ? "-" : " ";
			for (int j = 0; j < n; j++) {
				strBuilder.append(seg);
			}
			strBuilder.append("  ");
		}
		strBuilder.append("\n");

		StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			tmp.append(SEGMENT[Character.getNumericValue(s.charAt(i))][1] ? "|" : " ");
			for (int j = 0; j < n; j++) {
				tmp.append(" ");
			}
			tmp.append(SEGMENT[Character.getNumericValue(s.charAt(i))][2] ? "|" : " ");
			tmp.append(" ");
		}

		for (int i = 0; i < n; i++) {
			strBuilder.append(tmp);
			strBuilder.append("\n");
		}

		for (int i = 0; i < s.length(); i++) {
			strBuilder.append(" ");
			String seg = SEGMENT[Character.getNumericValue(s.charAt(i))][3] ? "-" : " ";
			for (int j = 0; j < n; j++) {
				strBuilder.append(seg);
			}
			strBuilder.append("  ");
		}
		strBuilder.append("\n");

		tmp.setLength(0);
		for (int i = 0; i < s.length(); i++) {
			tmp.append(SEGMENT[Character.getNumericValue(s.charAt(i))][4] ? "|" : " ");
			for (int j = 0; j < n; j++) {
				tmp.append(" ");
			}
			tmp.append(SEGMENT[Character.getNumericValue(s.charAt(i))][5] ? "|" : " ");
			tmp.append(" ");
		}

		for (int i = 0; i < n; i++) {
			strBuilder.append(tmp);
			strBuilder.append("\n");
		}

		for (int i = 0; i < s.length(); i++) {
			strBuilder.append(" ");
			String seg = SEGMENT[Character.getNumericValue(s.charAt(i))][6] ? "-" : " ";
			for (int j = 0; j < n; j++) {
				strBuilder.append(seg);
			}
			strBuilder.append("  ");
		}

		System.out.print(strBuilder.toString());

	}

	public static void main(String[] args) {
		new T02290___LCDTest().solve();
	}
}
