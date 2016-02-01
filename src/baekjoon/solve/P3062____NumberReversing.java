package baekjoon.solve;
import java.util.Scanner;

public class P3062____NumberReversing {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String input = sc.next();
			StringBuilder reverse = new StringBuilder();
			for (int i = input.length() - 1; i >= 0; i--) {
				reverse.append(input.charAt(i));
			}

			String sum = String.valueOf(Integer.parseInt(input) + Integer.parseInt(reverse.toString()));
			if(isSymmetry(sum)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
	private boolean isSymmetry(String s){
		for (int i = 0; i < s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - i -1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new P3062____NumberReversing().solve();
	}
}
