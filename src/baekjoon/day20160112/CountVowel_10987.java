package baekjoon.day20160112;
import java.util.Scanner;

public class CountVowel_10987 {

	public CountVowel_10987() {
		scan();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextLine());
	}

	private void operate(String input) {
		int count = 0;
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count ++;
			}
		}
		print(count);
	}

	private void print(int result) {
		System.out.println(result);
	}

	public static void main(String[] args) {
		new CountVowel_10987();
	}
}
