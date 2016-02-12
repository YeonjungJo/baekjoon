package baekjoon.solve;
import java.util.Scanner;

public class P9093____WordReversing {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		StringBuilder strBuilder = new StringBuilder();
		for (int t = 0; t < testcase; t++) {
			String[] k = sc.nextLine().split(" ");
			for (int i = 0; i < k.length; i++) {
				for (int j = 0; j < k[i].length(); j++) {
					strBuilder.append(k[i].charAt(k[i].length() - j - 1));
				}
				strBuilder.append(" ");
			}
			strBuilder.append("\n");
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P9093____WordReversing().solve();
	}
}
