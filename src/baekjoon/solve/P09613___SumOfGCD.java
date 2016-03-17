package baekjoon.solve;
import java.util.Scanner;

public class P09613___SumOfGCD {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					sum += gcd(a[i], a[j]);
				}
			}
			System.out.println(sum);
		}
	}

	private int gcd(int a, int b) {
		int gcd = 1;
		for (int i = 2; i <= (a > b ? b : a); i++) {
			if (a % i == 0 && b % i == 0) {
				gcd *= i;
				a /= i;
				b /= i;
				i = 1;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		new P09613___SumOfGCD().solve();
	}
}
