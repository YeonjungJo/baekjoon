package baekjoon.solve;
import java.util.Scanner;

public class P04446___ROT13 {

	private static final Scanner sc = new Scanner(System.in);

	private static final String VOWEL = "aiyeou";
	private static final String CONSONANT = "bkxznhdcwgpvjqtsrlmf";

	private void solve() {
		StringBuilder result = new StringBuilder();
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (Character.isAlphabetic(c)) {
					if (Character.isLowerCase(c)) {
						if (VOWEL.contains(Character.toString(c))) {
							int idx = VOWEL.indexOf(c) - 3;
							result.append(VOWEL.charAt(idx >= 0 ? idx : idx + VOWEL.length()));
						} else {
							int idx = CONSONANT.indexOf(c) - 10;
							result.append(CONSONANT.charAt(idx >= 0 ? idx : idx + CONSONANT.length()));
						}
					} else {
						c = Character.toLowerCase(c);
						if (VOWEL.contains(Character.toString(c))) {
							int idx = VOWEL.indexOf(c) - 3;
							result.append(Character.toUpperCase(VOWEL.charAt(idx >= 0 ? idx : idx + VOWEL.length())));
						} else {
							int idx = CONSONANT.indexOf(c) - 10;
							result.append(Character.toUpperCase(CONSONANT.charAt(idx >= 0 ? idx : idx + CONSONANT.length())));
						}
					}
				} else {
					result.append(c);
				}
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		new P04446___ROT13().solve();
	}
}
