
public class Test {

	private static final String LARGE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		String s = "10100";
		System.out.printf("%d\n", s.length() - s.replaceAll("[0]*$", "").length());
	}
}
