package baekjoon.day20160112;
import java.util.Scanner;

public class UppercaseFirstCharacter_4458 {

	private int testcase;
	private String[] input;

	public UppercaseFirstCharacter_4458() {
		scan();
		print();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		testcase = Integer.parseInt(sc.nextLine());
		input = new String[testcase];
		for (int i = 0; i < testcase; i++) {
			input[i] = sc.nextLine();
		}
	}

	private void print() {
		for (int i = 0; i < testcase; i++) {
			char uppercase = Character.toUpperCase(input[i].charAt(0));
			System.out.println(uppercase + input[i].substring(1));
		}
	}

	public static void main(String[] args) {
		new UppercaseFirstCharacter_4458();
	}
}
