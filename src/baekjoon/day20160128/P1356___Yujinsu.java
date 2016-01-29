package baekjoon.day20160128;
import java.util.Scanner;

public class P1356___Yujinsu {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();

		long multiplication = 1;
		for (int i = 0; i < input.length; i++) {
			multiplication *= Character.getNumericValue(input[i]);
		}

		if (multiplication == 0) {
			String tmp = String.valueOf(input);
			if (tmp.length() - tmp.replace("0", "").length() == 1) {
				System.out.println("NO");
				return;
			} else {
				System.out.println("YES");
				return;
			}
		}

		long tmp = 1;
		for (int i = 0; i < input.length - 1; i++) {
			int number = Character.getNumericValue(input[i]);
			tmp *= number;
			multiplication /= number;
			if (tmp == multiplication) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		new P1356___Yujinsu().solve();
	}
}
