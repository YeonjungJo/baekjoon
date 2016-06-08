package baekjoon.solve;
import java.util.Scanner;

public class P02999___SecretEmail {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		int r = factorization(s.length());
		int c = s.length() / r;

		char[][] a = new char[r][c];
		for (int j = 0; j < c; j++) {
			for (int i = 0; i < r; i++) {
				a[i][j] = s.charAt(i + j * r);
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				stringBuilder.append(a[i][j]);
			}
		}
		System.out.println(stringBuilder.toString());
	}

	private int factorization(int n) {
		int k = 1;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) k = i;
		}
		return k;
	}

	public static void main(String[] args) {
		new P02999___SecretEmail().solve();
	}
}
