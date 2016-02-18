package baekjoon.solve;
import java.util.Scanner;

public class P02810___CupHolder {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		String s = sc.next();

		int result = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L') i++;
			result++;
		}
		
		System.out.println(result > n ? n : result);
	}

	public static void main(String[] args) {
		new P02810___CupHolder().solve();
	}
}
