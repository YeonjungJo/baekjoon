package baekjoon.solve;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class P01706___Crossword {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] a = new char[n][m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}

		LinkedList<String> word = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			StringBuilder strBuilder = new StringBuilder();
			for (int j = 0; j < m; j++) {
				if (a[i][j] != '#') strBuilder.append(a[i][j]);
				if (a[i][j] == '#' || j == m - 1) {
					if (strBuilder.length() > 1) word.add(strBuilder.toString());
					strBuilder.setLength(0);
				}
			}
		}

		for (int j = 0; j < m; j++) {
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < n; i++) {
				if (a[i][j] != '#') strBuilder.append(a[i][j]);
				if (a[i][j] == '#' || i == n - 1) {
					if (strBuilder.length() > 1) word.add(strBuilder.toString());
					strBuilder.setLength(0);
				}
			}
		}

		String[] d = word.toArray(new String[word.size()]);
		Arrays.sort(d);
		System.out.println(d[0]);
	}

	public static void main(String[] args) {
		new P01706___Crossword().solve();
	}
}
