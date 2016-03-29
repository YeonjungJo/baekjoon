
public class Util {

	private static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		String s = "abcd. edf(egs)-agc-ddf";
		String[] word = s.split("[^a-zA-Z|-]");
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}
}
