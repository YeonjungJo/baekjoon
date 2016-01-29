package baekjoon.day20160112;
import java.util.Scanner;

public class RadixTransformation_11005 {

	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public RadixTransformation_11005() {
		scan();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextInt(), sc.nextInt());
	}

	private void operate(int decimal, int base) {
		StringBuilder trans = new StringBuilder();
		while (decimal != 0) {
			int code = decimal % base;
			if (code >= 10) {
				trans.insert(0, alphabet.charAt(code - 10));
			} else {
				trans.insert(0, code);
			}
			decimal /= base;
		}
		print(trans.toString());
	}

	private void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new RadixTransformation_11005();
	}
}
