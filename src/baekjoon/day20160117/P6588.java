package baekjoon.day20160117;
import java.util.Scanner;

public class P6588 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int input;
		while (true) {
			input = sc.nextInt();
			if (input == 0) return;
			else discriminant(input);
		}
	}

	private void discriminant(int input) {
		for (int i = 3; i <= input / 2; i = i + 2) {
			if (isPrimeNubmer(i) && isPrimeNubmer(input - i)) {
				System.out.println(input + " = " + i + " + " + (input - i));
				return;
			}
		}
		System.out.println("Goldbach's conjecture is wrong.");
	}

	private boolean isPrimeNubmer(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P6588().solve();
	}
}
