package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01339___WordMath {

	private static final Scanner sc = new Scanner(System.in);

	private static final int ALPHABET_LENGTH = 26;
	private static final int NUMBER_LENGTH = 8;

	private void solve() {
		int n = sc.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = String.format("%8s", sc.next());
		}

		Alphabet[] alphabet = new Alphabet[ALPHABET_LENGTH];
		for (int i = 0; i < ALPHABET_LENGTH; i++) {
			alphabet[i] = new Alphabet((char) ('A' + i));
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < NUMBER_LENGTH; j++) {
				if (a[i].charAt(j) != ' ') alphabet[a[i].charAt(j) - 'A'].update(j);
			}
		}
		Arrays.sort(alphabet);

		int[] result = new int[ALPHABET_LENGTH];
		for (int i = 0; i < ALPHABET_LENGTH; i++) {
			result[alphabet[i].id - 'A'] = 9 - i;
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			StringBuilder strBuilder = new StringBuilder();
			for (int j = 0; j < NUMBER_LENGTH; j++) {
				char c = a[i].charAt(j);
				if (c != ' ') strBuilder.append(result[c - 'A']);
			}
			sum += Integer.parseInt(strBuilder.toString());
		}

		System.out.println(sum);
	}

	private class Alphabet implements Comparable<Alphabet> {
		char id;
		int[] freq = null;

		public Alphabet(char id) {
			this.id = id;
			freq = new int[NUMBER_LENGTH];
		}

		@Override
		public int compareTo(Alphabet o) {
			for (int i = 0; i < NUMBER_LENGTH; i++) {
				if (freq[i] > o.freq[i]) return -1;
				if (freq[i] < o.freq[i]) return 1;
			}
			return 0;
		}

		public void update(int j) {
			freq[j]++;
		}
	}

	public static void main(String[] args) {
		new P01339___WordMath().solve();
	}
}
