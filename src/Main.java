import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);

	private static final String REGEX = "[a-zA-Z|-]+";

	private void solve() {
		int max = 0;
		String word = "";
		while (true) {
			String tmp = sc.next();
			tmp.replaceFirst(REGEX, "");
			if (tmp.equals("E-N-D")) break;
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}