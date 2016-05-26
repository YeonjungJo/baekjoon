package baekjoon.todo;
import java.util.Scanner;

public class T01718___Encryption {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		String[] plain = sc.nextLine().split(" ");
		String encryption = sc.nextLine();

		StringBuilder strBuilder = new StringBuilder();
		int k = 0;

		for (int i = 0; i < plain.length; i++) {
			for (int j = 0; j < plain[i].length(); j++) {
				if (k >= encryption.length()) k -= encryption.length();
				int idx = plain[i].charAt(j) - encryption.charAt(k) - 1;
				if (idx < 0) idx += 26;
				strBuilder.append(LOWERCASE_ALPHABET.charAt(idx));
				k++;
			}
			strBuilder.append(" ");
			k++;
		}

		System.out.println(strBuilder.toString());

	}

	public static void main(String[] args) {
		new T01718___Encryption().solve();
	}
}
