package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P09047___6174 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String input = sc.next();
			if (input.equals("6174")) {
				System.out.println("0");
				continue;
			}
			char[] s = input.toCharArray();
			for (int k = 1;; k++) {
				Arrays.sort(s);
				int b = 0;
				int a = 0;
				for (int i = 0; i < 4; i++) {
					a += (int) (Math.pow(10, i) * Character.getNumericValue(s[i]));
					b = b * 10 + Character.getNumericValue(s[i]);
				}
//				System.out.println(k + " " + a + " - " + b + " = " + String.format("%04d", a - b));
				if (a - b == 6174) {
					System.out.println(k);
					break;
				} else {
					s = String.format("%04d", a - b).toCharArray();
				}
			}
		}
	}

	public static void main(String[] args) {
		new P09047___6174().solve();
	}
}
