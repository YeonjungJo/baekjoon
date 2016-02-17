package baekjoon.solve;

import java.util.Scanner;

public class P09734___RecurringDecimal {

	private static final Scanner sc = new Scanner(System.in);

	private static final String NOT_NUMBER = "[(|)|.]";

	private void solve() {
		while (sc.hasNext()) {
			String s = sc.next();
			long[] fraction = mkFraction(s);
			long[] simpleFraction = findSimpleFraction(fraction);
			System.out.println(s + " = " + simpleFraction[0] + " / " + simpleFraction[1]);
		}
	}

	private long[] findSimpleFraction(long[] fraction) {
		long gcd = 1;
		for (int i = 2; i <= fraction[0] && i <= fraction[1]; i++) {
			if (fraction[0] % i == 0 && fraction[1] % i == 0) gcd = i;
		}
		fraction[0] /= gcd;
		fraction[1] /= gcd;
		return fraction;
	}

	private long[] mkFraction(String s) {
		long[] fraction = new long[2];
		String number = s.replaceAll(NOT_NUMBER, "");
		String circulating = (String) s.subSequence(s.indexOf("(") + 1, s.indexOf(")"));

		fraction[0] = Long.parseLong(number) - Long.parseLong(s.substring(0, s.indexOf("(")).replace(".", ""));
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < circulating.length(); i++)
			strBuilder.append("9");
		for (int i = 0; i < s.indexOf("(") - s.indexOf(".") - 1; i++)
			strBuilder.append("0");
		fraction[1] = Long.parseLong(strBuilder.toString());
		return fraction;
	}

	public static void main(String[] args) {
		new P09734___RecurringDecimal().solve();
	}
}
