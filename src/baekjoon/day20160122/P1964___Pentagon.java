package baekjoon.day20160122;
import java.util.Scanner;

public class P1964___Pentagon {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long sum = 5;
		for (int i = 2; i <= n; i++) {
			sum += i * 3 + 1;
			sum %= 45678;
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new P1964___Pentagon().solve();
	}
}
