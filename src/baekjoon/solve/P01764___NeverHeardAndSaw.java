package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01764___NeverHeardAndSaw {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] h = new String[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.next();
		}
		String[] s = new String[m];
		for (int i = 0; i < m; i++) {
			s[i] = sc.next();
		}

		Arrays.sort(h);
		Arrays.sort(s);

		StringBuilder name = new StringBuilder();

		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (h[i].compareTo(s[j]) == 0) {
				name.append(h[i] + "\n");
				i++;
				j++;
			} else if (h[i].compareTo(s[j]) > 0) {
				j++;
			} else if (h[i].compareTo(s[j]) < 0) {
				i++;
			}
		}

		if (name.toString().length() == 0) System.out.println(0);
		else System.out.println(name.toString().split("\n").length);
		System.out.println(name.toString());
	}

	public static void main(String[] args) {
		new P01764___NeverHeardAndSaw().solve();
	}
}
