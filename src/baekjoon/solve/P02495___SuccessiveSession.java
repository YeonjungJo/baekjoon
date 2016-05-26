package baekjoon.solve;
import java.util.Scanner;

public class P02495___SuccessiveSession {

	private static final Scanner sc = new Scanner(System.in);

	private static final int TEST_CASE = 3;
	private static final int P_LENGTH = 8;

	private void solve() {
		for (int i = 0; i < TEST_CASE; i++) {
			char[] problem = sc.next().toCharArray();

			int tmp = 1;
			int max = 1;
			for (int k = 1; k < P_LENGTH; k++) {
				if (problem[k] == problem[k - 1]) tmp++;
				else tmp = 1;
				if (max < tmp) max = tmp;
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new P02495___SuccessiveSession().solve();
	}
}
