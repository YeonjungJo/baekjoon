package baekjoon.solve;
import java.util.Scanner;

public class P10384___Pangram {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 1; t <= testcase; t++) {
			int[] d = new int[26];

			String s = sc.nextLine().toLowerCase();
			for (int i = 0; i < s.length(); i++) {
				int tmp = s.charAt(i) - 'a';
				if (tmp >= 0 && tmp < 26) d[tmp]++;
			}

			int min = 3;
			for (int i = 0; i < 26; i++) {
				if (d[i] < min) min = d[i];
			}

			if (min == 0) System.out.printf("Case %d: %s\n", t, "Not a pangram");
			else if (min == 1) System.out.printf("Case %d: %s\n", t, "Pangram!");
			else if (min == 2) System.out.printf("Case %d: %s\n", t, "Double pangram!!");
			else System.out.printf("Case %d: %s\n", t, "Triple pangram!!!");
		}
	}

	public static void main(String[] args) {
		new P10384___Pangram().solve();
	}
}
