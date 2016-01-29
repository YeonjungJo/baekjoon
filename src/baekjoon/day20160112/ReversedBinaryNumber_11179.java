package baekjoon.day20160112;
import java.util.Scanner;

public class ReversedBinaryNumber_11179 {

	private int input;

	public ReversedBinaryNumber_11179() {
		scan();
		operate();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
	}

	private void operate() {
		StringBuilder bin = new StringBuilder();
		while (input != 0) {
			bin.append(input % 2);
			input /= 2;
		}
		int result = 0;
		for (int i = 0; i<bin.length(); i++) {
			result += Character.getNumericValue(bin.charAt(i)) * Math.pow(2, bin.length() - i - 1);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new ReversedBinaryNumber_11179();
	}
}
