package baekjoon.solve;
import java.util.Scanner;

public class P05218___AlphabetDistance {

	private static final Scanner sc = new Scanner(System.in);

	private static final String LARGE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			char[] x = sc.next().toCharArray();
			char[] y = sc.next().toCharArray();

			System.out.print("Distances: ");

			for (int i = 0; i < x.length; i++) {
				int valueX = LARGE_ALPHABET.indexOf(x[i]);
				int valueY = LARGE_ALPHABET.indexOf(y[i]);
				if (valueY >= valueX) System.out.print((valueY - valueX) + " ");
				else System.out.print((valueY + 26 - valueX) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P05218___AlphabetDistance().solve();
	}
}
