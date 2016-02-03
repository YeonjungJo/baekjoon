package baekjoon.solve;
import java.util.Scanner;

public class P10809___FindAlphabet {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	private void solve() {
		int[] data = new int[26];
		String s = sc.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
			data[ALPHABET.indexOf(s.charAt(i))] = i;
		}

		int zero = ALPHABET.indexOf(s.charAt(0));
		
		for (int i = 0; i < 26; i++) {
			if(i == zero) System.out.print(0 + " ");
			else if (data[i] == 0) System.out.print(-1 + " ");
			else System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] args) {
		new P10809___FindAlphabet().solve();
	}
}
