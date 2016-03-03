package baekjoon.solve;
import java.util.Scanner;

public class P01296___Date {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] love = new int[4];
		getLove(sc.next(), love);

		int n = sc.nextInt();

		int max = 0;
		String girl = "ZZZZZZZZZZZZZZZZZZZZ";

		for (int i = 0; i < n; i++) {
			int[] loveGirl = new int[4];
			String s = sc.next();
			getLove(s, loveGirl);
			int tmp = calculate(love, loveGirl);
			if (tmp > max) {
				max = tmp;
				girl = s;
			} else if (tmp == max) {
				if (girl.compareTo(s) > 0) girl = s;
			}
		}

		System.out.println(girl);
	}

	private int calculate(int[] love, int[] loveGirl) {
		int[] sum = new int[4];
		for (int i = 0; i < 4; i++)
			sum[i] = love[i] + loveGirl[i];
		return ((sum[0] + sum[1]) * (sum[0] + sum[2]) * (sum[0] + sum[3]) * (sum[1] + sum[2]) * (sum[1] + sum[3]) * (sum[2] + sum[3]))
				% 100;
	}

	private void getLove(String s, int[] love) {
		love[0] = s.length() - s.replaceAll("L", "").length();
		love[1] = s.length() - s.replaceAll("O", "").length();
		love[2] = s.length() - s.replaceAll("V", "").length();
		love[3] = s.length() - s.replaceAll("E", "").length();
	}

	public static void main(String[] args) {
		new P01296___Date().solve();
	}
}
