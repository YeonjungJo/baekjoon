package baekjoon.solve;
import java.util.Scanner;

public class P01371___MostFrequentlyCharacter {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {

		int[] data = new int[ALPHABET.length()];

		while (sc.hasNextLine()) {
			String s = sc.nextLine().replaceAll("[^a-z]", "");
			for (int i = 0; i < s.length(); i++) {
				data[ALPHABET.indexOf(s.charAt(i))]++;
			}
		}

		int max = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				result.setLength(0);
				result.append(ALPHABET.charAt(i));
				max = data[i];
			} else if (data[i] == max) {
				result.append(ALPHABET.charAt(i));
			}
		}

		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		new P01371___MostFrequentlyCharacter().solve();
	}
}