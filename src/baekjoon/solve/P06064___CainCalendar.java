package baekjoon.solve;
import java.util.Scanner;

public class P06064___CainCalendar {

	private static final Scanner sc = new Scanner(System.in);

	private static final int IMPOSSIBLE = -1;

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x > y) System.out.println(getYear(n, m, y, x));
			else System.out.println(getYear(m, n, x, y));
		}
	}

	private int getYear(int m, int n, int x, int y) {
		int gcd = gcd(m, n);
		for (int a = 0; a <= n / gcd; a++) {
			double b = (a * m + x - y) / (double) n;
			if (b == (int) b) return a * m + x;
		}
		return IMPOSSIBLE;
	}

	private int gcd(int m, int n) {
		int gcd = 1;
		int min = m > n ? n : m;
		for (int i = 2; i <= Math.sqrt(min);) {
			if (m % i == 0 && n % i == 0) {
				m /= i;
				n /= i;
				gcd *= i;
			} else {
				i++;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		new P06064___CainCalendar().solve();
	}
}
