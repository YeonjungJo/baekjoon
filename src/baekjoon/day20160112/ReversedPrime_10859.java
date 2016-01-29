package baekjoon.day20160112;
import java.util.Scanner;

public class ReversedPrime_10859 {

	private String input;

	public ReversedPrime_10859() {
		scan();
		if (result()) System.out.println("yes");
		else System.out.println("no");
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		input = sc.next();
	}

	private boolean result() {
		if (!isprime(input)) return false;
		String reverse = getReverse(input);
		if (reverse == null) return false;
		if (!isprime(reverse)) return false;
		return true;
	}

	private String getReverse(String input) {
		StringBuilder reverse = new StringBuilder();
		while (input.length() > 0) {
			char c = input.charAt(input.length() - 1);
			switch (c) {
				case '0':
				case '2':
				case '5':
				case '8':
				case '1':
					reverse.append(c);
					break;
				case '6':
					reverse.append("9");
					break;
				case '9':
					reverse.append("6");
					break;
				default:
					return null;
			}
			input = input.substring(0, input.length()-1);
		}
		return reverse.toString();
	}

	private boolean isprime(String number) {
		Double d = Double.parseDouble(number);
		if(d == 1) return false;
		for (int i = 2; i <= Math.sqrt(d); i++) {
			if (d % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new ReversedPrime_10859();
	}
}
