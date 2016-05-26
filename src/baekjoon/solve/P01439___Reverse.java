package baekjoon.solve;
import java.util.Scanner;

public class P01439___Reverse {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		char[] s = sc.nextLine().toCharArray();

		int cnt[] = new int[2];

		char tmp = s[0];
		for (int i = 1; i < s.length; i++) {
			if (tmp != s[i]) {
				if (tmp == '0') cnt[0]++;
				else cnt[1]++;
				tmp = s[i];
			}
		}
		
		if (tmp == '0') cnt[0]++;
		else cnt[1]++;

		System.out.println(cnt[0] < cnt[1] ? cnt[0] : cnt[1]);
	}

	public static void main(String[] args) {
		new P01439___Reverse().solve();
	}
}
