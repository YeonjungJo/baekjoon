
public class Util {

	private static final String LARGE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private static final String SPECIAL_SYMBOL = "[(|)|{|}|[|]|.|,|;|:]";

	public static void main(String[] args) {
		String a = "a b { c ,   .   :   ";
		System.out.println(a.replaceAll("[ ]+[:][ ]+", ":"));
	}
}
