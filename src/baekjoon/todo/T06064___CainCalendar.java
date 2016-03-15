package baekjoon.todo;
import java.util.Scanner;

public class T06064___CainCalendar {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			findYear(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
	}

	private void findYear(int m, int n, int x, int y) {
		int lcm = findLCM(m, n);
		for (int i = 0; i <= lcm / m; i++) {
			for (int j = 0; j <= lcm / n; j++) {
				if (m * i - n * j == y - x) {
					System.out.println(m * i + x);
					return;
				}
				if (m * i - n * j < y - x) {
					break;
				}
			}
		}
		System.out.println(-1);
	}

	private int findLCM(int m, int n) {
		int gcd = 1;
		int abs = Math.abs(m - n);
		for (int i = 2; i <= abs; i++) {
			if (m % i == 0 && n % i == 0) {
				gcd *= i;
				m /= i;
				n /= i;
			}
		}
		return gcd * n * m;
	}

	public static void main(String[] args) {
		new T06064___CainCalendar().solve();
	}
}
