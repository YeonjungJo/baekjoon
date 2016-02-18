package baekjoon.solve;
import java.util.Scanner;

public class P05211___CmajorAminor {

	private static final Scanner sc = new Scanner(System.in);

	private static final String MAJOR = "CFG";
	private static final String MINOR = "ADE";

	private void solve() {
		int[] freq = new int[2];

		String[] s = sc.nextLine().split("[|]");
		for (int i = 0; i < s.length; i++) {
			String key = Character.toString(s[i].charAt(0));
			if (MAJOR.contains(key)) freq[0]++;
			if (MINOR.contains(key)) freq[1]++;
		}

		if (freq[0] > freq[1]) System.out.println("C-major");
		if (freq[0] < freq[1]) System.out.println("A-minor");
		if (freq[0] == freq[1]) {
			String key = Character.toString(s[s.length - 1].charAt(s[s.length - 1].length() - 1));
			if (MAJOR.contains(key)) System.out.println("C-major");
			if (MINOR.contains(key)) System.out.println("A-minor");
		}
	}

	public static void main(String[] args) {
		new P05211___CmajorAminor().solve();
	}
}