package baekjoon.solve;
import java.util.Scanner;

public class P11170___CountZero {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int start = sc.nextInt();
			int stop = sc.nextInt();

			int count = 0;
			for (int i = start; i <= stop; i++) {
				count += Integer.toString(i).length() - Integer.toString(i).replace("0", "").length();
			}
			
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		new P11170___CountZero().solve();
	}
}
