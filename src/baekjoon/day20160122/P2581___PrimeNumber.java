package baekjoon.day20160122;
import java.util.Scanner;

public class P2581___PrimeNumber {

	private void solve() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int sum = 0;
		int min = m;

		for (int i = n; i <= m; i++) {
			if (isPrimeNumber(i)) {
				sum += i;
				min = min > i ? i : min;
			}
		}

		if (sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println("-1");
		}
	}

	private boolean isPrimeNumber(int number) {
		if (number <= 1) return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P2581___PrimeNumber().solve();
	}
}
