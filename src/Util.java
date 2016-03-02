
public class Util {

	private static final String LARGE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		String s = "123123123";
		String r = "[1]";
		System.out.println(s.replaceAll(r, ""));
	}
}
