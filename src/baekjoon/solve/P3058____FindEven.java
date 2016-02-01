package baekjoon.solve;
import java.util.Scanner;

public class P3058____FindEven {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int min = 100;
			int sum = 0;
			for (int i = 0; i < 7; i++) {
				int tmp = sc.nextInt();
				if (tmp % 2 == 0) {
					min = tmp > min ? min : tmp;
					sum += tmp;
				}
			}
			System.out.println(sum + " " + min);
		}
	}

	public static void main(String[] args) {
		new P3058____FindEven().solve();
	}
}
