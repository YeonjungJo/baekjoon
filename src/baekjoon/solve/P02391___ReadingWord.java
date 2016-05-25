package baekjoon.solve;
import java.util.Scanner;

public class P02391___ReadingWord {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NO_AVAILABLE = -1;

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String announced = sc.next();

			int n = sc.nextInt();
			int min = announced.length() + 1;
			String word = "";
			for (int i = 0; i < n; i++) {
				String s = sc.next();

				int tmp = compare(s.length(), announced, s, min);
				if (tmp != NO_AVAILABLE) {
					min = tmp;
					word = s;
				}
			}
			
			System.out.println(word);
		}
	}

	private int compare(int n, String announced, String s, int min) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (announced.charAt(i) != s.charAt(i)) count++;
			if (count >= min) return NO_AVAILABLE;
		}
		return count;
	}

	public static void main(String[] args) {
		new P02391___ReadingWord().solve();
	}
}
