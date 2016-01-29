package baekjoon.day20160112;
import java.util.Scanner;

public class ReverseString_11365 {

	public ReverseString_11365() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String crypto = sc.nextLine();
			if (crypto.equals("END")) return;
			for (int i = 0; i < crypto.length(); i++) {
				System.out.print(crypto.charAt(crypto.length() - i - 1));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new ReverseString_11365();
	}
}
