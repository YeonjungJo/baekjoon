package baekjoon.solve;
import java.util.Scanner;

public class P07789___TelePrime {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.next();
		String b = sc.next();

		boolean flag = isPrimeNumber(Long.parseLong(a));
		if (!flag) {
			System.out.println("No");
			return;
		}

		System.out.println(isPrimeNumber(Long.parseLong(b + a)) ? "Yes" : "No");
	}

	private boolean isPrimeNumber(long number) {
		if (number < 2) return false;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P07789___TelePrime().solve();
	}
}
