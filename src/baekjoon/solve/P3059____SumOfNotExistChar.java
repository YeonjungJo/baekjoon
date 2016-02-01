package baekjoon.solve;
import java.util.Scanner;

public class P3059____SumOfNotExistChar {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			boolean[] data = new boolean[26];
			String input = sc.next();
			for (int i = 0; i < input.length(); i++) {
				data[ALPHABETS.indexOf(input.charAt(i))] = true;
			}
			int sum = 0;
			for (int i = 0; i < data.length; i++) {
				if (!data[i]) sum += i + 65;
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new P3059____SumOfNotExistChar().solve();
	}
}
