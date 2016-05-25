
public class Util {

	private static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private static final String BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for(int i=0; i<1000; i++){
			str.append("A");
		}
		System.out.println(str.toString());
	}
}
