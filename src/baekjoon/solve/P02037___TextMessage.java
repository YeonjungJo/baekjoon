package baekjoon.solve;
import java.util.Scanner;

public class P02037___TextMessage {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABETS = " ABC  DEF  GHI  JKL  MNO  PQRS TUV  WXYZ ";

	private void solve() {
		int p = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		long result = 0;
		int before = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				result += p;
				before = -1;
				continue;
			}
			int tmp = ALPHABETS.indexOf(s.charAt(i));
			int num = tmp / 5;
			if (before == num) result += w;
			result += p * (tmp % 5);
			before = num;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new P02037___TextMessage().solve();
	}
}
