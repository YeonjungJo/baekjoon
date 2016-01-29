package baekjoon.day20160122;
import java.util.Scanner;

public class P2153___PrimeNumberWord {

	private static final String ALPHABET = "_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int toInteger = 0;
		for (int i = 0; i < input.length(); i++) {
			toInteger += ALPHABET.indexOf(input.charAt(i));
		}

		if (toInteger != 1) {
			for (int i = 2; i <= Math.sqrt(toInteger); i++) {
				if (toInteger % i == 0) {
					System.out.println("It is not a prime word.");
					return;
				}
			}
		}
		System.out.println("It is a prime word.");
	}

	public static void main(String[] args) {
		new P2153___PrimeNumberWord().solve();
	}
}
