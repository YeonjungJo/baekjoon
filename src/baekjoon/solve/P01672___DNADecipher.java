package baekjoon.solve;
import java.util.Scanner;

public class P01672___DNADecipher {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[][] code = { { 0, 2, 0, 1 }, { 2, 1, 3, 0 }, { 0, 3, 2, 1 }, { 1, 0, 1, 3 } };

		int n = sc.nextInt();
		String base = sc.next().replace('A', '0').replace('G', '1').replace('C', '2').replace('T', '3');

		int k = Character.getNumericValue(base.charAt(n - 1));
		for (int i = n - 1; i > 0; i--) {
			int tmp = Character.getNumericValue(base.charAt(i - 1));
			k = code[tmp][k];
		}

		System.out.println(getBase(k));
	}

	private char getBase(int k) {
		switch (k) {
		case 0:
			return 'A';
		case 1:
			return 'G';
		case 2:
			return 'C';
		case 3:
			return 'T';
		}
		return 0 ;
	}

	public static void main(String[] args) {
		new P01672___DNADecipher().solve();
	}
}
