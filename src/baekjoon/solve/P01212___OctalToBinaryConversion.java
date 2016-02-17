package baekjoon.solve;
import java.util.Scanner;

public class P01212___OctalToBinaryConversion {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.nextLine();

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			strBuilder.append(octTobin(Character.getNumericValue(s.charAt(i))));
		}

		String result = strBuilder.toString().replaceFirst("^([0]+1)", "1");
		if (!result.contains("1")) System.out.println("0");
		else System.out.println(result);
	}

	private String octTobin(int n) {
		StringBuilder s = new StringBuilder();
		if (n == 0) return "000";
		while (n > 0) {
			s.insert(0, n % 2);
			n /= 2;
		}
		return String.format("%03d", Integer.parseInt(s.toString()));
	}

	public static void main(String[] args) {
		new P01212___OctalToBinaryConversion().solve();
	}
}
