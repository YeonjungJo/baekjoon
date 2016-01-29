package baekjoon.day20160112;
import java.util.Scanner;

public class Rot13_11655 {

	private String input;

	public Rot13_11655() {
		scan();
		print();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
	}

	private void print() {
		for (int i = 0; i < input.length(); i++) {
			int unicode = input.charAt(i);
			if ((unicode >= 65 && unicode <= 77) || (unicode >= 91 && unicode <= 109)) {
				unicode += 13;
			} else if ((unicode >= 78 && unicode <= 90) || (unicode >= 110 && unicode <= 122)) {
				unicode -= 13;
			} else {
				System.out.print(input.charAt(i));
				continue;
			}
			String temp = Integer.toHexString(unicode);
			System.out.print(String.valueOf((char) Integer.parseInt(temp, 16)));
		}
	}

	public static void main(String[] args) {
		new Rot13_11655();
	}
}
