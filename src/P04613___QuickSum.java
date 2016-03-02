import java.util.Scanner;

public class P04613___QuickSum {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LARGE_ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		while (true) {
			String s = sc.nextLine();
			if (s.equals("#")) return;

			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				sum += LARGE_ALPHABET.indexOf(s.charAt(i)) * (i + 1);
			}

			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new P04613___QuickSum().solve();
	}
}
