package baekjoon.solve;
import java.util.Scanner;

public class P5347____LCM {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int gcd = 1;
			for (int i = 2; i <= a && i <= b; i++) {
				if (a % i == 0 && b % i == 0) gcd = i;
			}
			System.out.println(gcd * (a / gcd) * (b / gcd));
		}
	}

	public static void main(String[] args) {
		new P5347____LCM().solve();
	}
}
