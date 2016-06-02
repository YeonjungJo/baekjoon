package baekjoon.solve;
import java.util.Scanner;

public class P09094___MathematicalCurious {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int count = 0;
			for (int b = 1; b < n; b++) {
				for (int a = 1; a < b; a++) {
					if (check(a, b, m)) count++;
				}
			}
			
			System.out.println(count);
		}
	}

	private boolean check(int a, int b, int m) {
		return (a * a + b * b + m) % (a * b) == 0;
	}

	public static void main(String[] args) {
		new P09094___MathematicalCurious().solve();
	}
}
