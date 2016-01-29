package baekjoon.day20160122;
import java.util.Scanner;

public class P3036___Ring {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int first = sc.nextInt();

		for (int i = 1; i < n; i++) {
			getSimpleFraction(first, sc.nextInt());
		}
	}

	private void getSimpleFraction(int first, int next) {
		int gcd = getGCD(first, next);
		System.out.println(first/gcd + "/" + next/gcd);
	}

	private int getGCD(int first, int next) {
		int gcd = 1;
		for (int i = 2; i <= (first > next ? next : first); i++) {
			if (first % i == 0 && next % i == 0) gcd = i;
		}
		return gcd;
	}

	public static void main(String[] args) {
		new P3036___Ring().solve();
	}
}
